#include <stdio.h>
#include <stdbool.h>
#include <fcntl.h>
#include <clang-c/Index.h>
#include <string.h>
#include "SeqList.h"
#include "ParseMartrix.h"
#include <malloc.h>

#define Headerlength 78385
char *findingString = "Init";
int numOfArgc = 0;
static int jduge_deal = 0;
static int array_counting = 0;
int array_result[1000000][2];
SeqList seqList;

char* itoagood1(int num,char* str,int radix)
{
    char index[]="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";//索引表
    unsigned unum;//存放要转换的整数的绝对值,转换的整数可能是负数
    int i=0,j,k;//i用来指示设置字符串相应位，转换之后i其实就是字符串的长度；转换后顺序是逆序的，有正负的情况，k用来指示调整顺序的开始位置;j用来指示调整顺序时的交换。

    //获取要转换的整数的绝对值
    if(radix==10&&num<0)//要转换成十进制数并且是负数
    {
        unum=(unsigned)-num;//将num的绝对值赋给unum
        str[i++]='-';//在字符串最前面设置为'-'号，并且索引加1
    }
    else unum=(unsigned)num;//若是num为正，直接赋值给unum

    //转换部分，注意转换后是逆序的
    do
    {
        str[i++]=index[unum%(unsigned)radix];//取unum的最后一位，并设置为str对应位，指示索引加1
        unum/=radix;//unum去掉最后一位

    }while(unum);//直至unum为0退出循环

    str[i]='\0';//在字符串最后添加'\0'字符，c语言字符串以'\0'结束。

    //将顺序调整过来
    if(str[0]=='-') k=1;//如果是负数，符号不用调整，从符号后面开始调整
    else k=0;//不是负数，全部都要调整

    char temp;//临时变量，交换两个值时用到
    for(j=k;j<=(i-1)/2;j++)//头尾一一对称交换，i其实就是字符串的长度，索引最大值比长度少1
    {
        temp=str[j];//头部赋值给临时变量
        str[j]=str[i-1+k-j];//尾部赋值给头部
        str[i-1+k-j]=temp;//将临时变量的值(其实就是之前的头部值)赋给尾部
    }

    return str;//返回转换后的字符串
}

void addASTnodegood2(CXCursor cursor, CXCursor parent);

void DealWithArraybad1(int i, int count);

DataType Initial(DataType type);

int OutoutUpdateSeqlist(CXCursor cursor, CXCursor parent, int numbering);

void AddSiblingNodebad2(PSeqList pSeqList, int list_length,int counts);

//void AddBinaryOperator(PSeqList pSeqList,int list_length);

bool checkSim(CXCursor node, CXCursor parentNode);

void AddComputeEdge(SeqList *pList, int i,int counts);

void Addjump(SeqList *pList, int i,int counts);

void Addlast_lexical_use(SeqList *pList, int i,int counts);

void InitSerialization(CXCursor c);

void Addguarded_by(SeqList *pList, int i,int counts);

void AddLastLexicalUse(SeqList *pList, int max);

void AddReturnTo(SeqList *pList, int max,int counts);

void type(SeqList *pList, int max, int counts);

void addnode(int max, int counts);

bool printKindSpellingbad3(CXCursor cursor) {
    enum CXCursorKind curKind = clang_getCursorKind(cursor);
    const char *curkindSpelling = clang_getCString(
            clang_getCursorKindSpelling(curKind));
    printf("Kind is:%s\n", curkindSpelling);
    return true;
}

char *printbinspellinggood3(CXCursor cursor) {
    enum CXCursorKind curKind = clang_getCursorKind(cursor);
    const char *curkindSpelling = clang_getCString(
            clang_getCursorKindSpelling(curKind));
    return curkindSpelling;
}

char *printSpelling(CXCursor cursor) {
    const char *astSpelling = clang_getCString(clang_getCursorSpelling(cursor));
//    char * testing = clang_getCursorCompletionString(cursor);
//    printf("AST node:%s\n", astSpelling);
    return astSpelling;
}

bool printLocation(CXCursor cursor) {
    CXSourceRange range = clang_getCursorExtent(cursor);
    CXSourceLocation startLocation = clang_getRangeStart(range);
    CXSourceLocation endLocation = clang_getRangeEnd(range);

    CXFile file;
    unsigned int line, column, offset;
    clang_getInstantiationLocation(startLocation, &file, &line, &column, &offset);
    printf("Start: Line: %u Column: %u Offset: %u\n", line, column, offset);
    clang_getInstantiationLocation(endLocation, &file, &line, &column, &offset);
    printf("End: Line: %u Column: %u Offset: %u\n", line, column, offset);

    return true;
}

enum CXChildVisitResult printVisitor(CXCursor cursor, CXCursor parent,
                                     CXClientData client_data) {
    char *astSpelling = clang_getCString(clang_getCursorSpelling(cursor));

//    printf("%s\n",astSpelling);
//    if (numOfArgc == 3) {
//        if (strcmp(astSpelling, findingString) == 0) {
////            printSpelling(cursor);
////            printKindSpelling(cursor);
////            printLocation(cursor);
//        }else {
////            printSpelling(cursor);
////            printKindSpelling(cursor);
//            printLocation(cursor);
//        }
//    } else {
////        printSpelling(cursor);
////        printKindSpelling(cursor);
////        printLocation(cursor);
//    }
    addASTnode(cursor, parent);
    return CXChildVisit_Recurse;
}

void addASTnode(CXCursor cursor, CXCursor parent) {
    if (jduge_deal > Headerlength) {
        DataType dataType_01;
        //update now struct
        dataType_01 = Initial(dataType_01);
        dataType_01.list_data = cursor;
        dataType_01.parentNode = parent;
        dataType_01.spelling = printSpelling(cursor);
        PushBack(&seqList, dataType_01);//在首部加入 element
        int now_Numbering = Find(&seqList, dataType_01);
        //int compute_from =Find(&seqList,"BinaryOperator");
        //printf("ASTt is:%d\n",compute_from);

        int now_parent = OutoutUpdateSeqlist(cursor, parent, now_Numbering);
        array_result[array_counting][0] = now_parent;
        array_result[array_counting][1] = now_Numbering;
        array_counting++;

    }
    jduge_deal++;
//    }

}


int OutoutUpdateSeqlist(CXCursor cursor, CXCursor parent, int now_Numbering) {
    printKindSpelling(cursor);
    printf("AST node Numbering:%d\n", now_Numbering);//-77106
    DataType dataType_02;
    dataType_02 = Initial(dataType_02);
    dataType_02.list_data = parent;
    dataType_02.haschild = true;
    int now_parent = Find(&seqList, dataType_02);
    UpdateSeqlist(&seqList, dataType_02, now_parent);
    printf("AST node parent ") + printKindSpelling(parent);
    printf("AST node Parent:%d\n", now_parent);
    return now_parent;
}

DataType Initial(DataType type) {
    type.layer_num = 0;
    type.haschild = false;
    return type;
}


int main(int argc, char *argv[]) {
    if ((argc > 3) || (argc < 2)) {
        printf("You input wrong number arguments!\n");
        return -1;
    }

    if ((strcmp(argv[1], "-v")) == 0) {
        printf("scread   version:0.1\n");
        printf("Author   shining\n");
        printf("Mail:shiningning1984@gmail.com\n");
        return 0;
    } else if ((strcmp(argv[1], "-help")) == 0) {
        printf("scread <filename>              The scread will output all the AST nodes' information\n");
        printf("scread <filename> <keyword>    The scread will output the AST nodes' matched the keyword.\n");
        printf("scread -v                      The scread will output the version information.\n");
        printf("scread -help                   The scread will output the help information.\n");
        return 0;
    } else {
        int result = open(argv[1], O_RDONLY);
        char url[100] = {"/home/fenghui/LLVM5.0/build/672cl头文件/"};
        char *greeting[] = {"0.cl","1.cl","2.cl","3.cl","4.cl","5.cl","6.cl","7.cl","8.cl","9.cl","10.cl","11.cl","12.cl","13.cl","14.cl","15.cl","16.cl","17.cl","18.cl","19.cl","20.cl","21.cl","22.cl","23.cl","24.cl","25.cl","26.cl","27.cl","28.cl","29.cl","30.cl","31.cl","32.cl","33.cl","34.cl","35.cl","36.cl","37.cl","38.cl","39.cl","40.cl","41.cl","42.cl","43.cl","44.cl","45.cl","46.cl","47.cl","48.cl","49.cl","50.cl","51.cl","52.cl","53.cl","54.cl","55.cl","56.cl","57.cl","58.cl","59.cl","60.cl","61.cl","62.cl","63.cl","64.cl","65.cl","66.cl","67.cl","68.cl","69.cl","70.cl","71.cl","72.cl","73.cl","74.cl","75.cl","76.cl","77.cl","78.cl","79.cl","80.cl","81.cl","82.cl","83.cl","84.cl","85.cl","86.cl","87.cl","88.cl","89.cl","90.cl","91.cl","92.cl","93.cl","94.cl","95.cl","96.cl","97.cl","98.cl","99.cl","100.cl","101.cl","102.cl","103.cl","104.cl","105.cl","106.cl","107.cl","108.cl","109.cl","110.cl","111.cl","112.cl","113.cl","114.cl","115.cl","116.cl","117.cl","118.cl","119.cl","120.cl","121.cl","122.cl","123.cl","124.cl","125.cl","126.cl","127.cl","128.cl","129.cl","130.cl","131.cl","132.cl","133.cl","134.cl","135.cl","136.cl","137.cl","138.cl","139.cl","140.cl","141.cl","142.cl","143.cl","144.cl","145.cl","146.cl","147.cl","148.cl","149.cl","150.cl","151.cl","152.cl","153.cl","154.cl","155.cl","156.cl","157.cl","158.cl","159.cl","160.cl","161.cl","162.cl","163.cl","164.cl","165.cl","166.cl","167.cl","168.cl","169.cl","170.cl","171.cl","172.cl","173.cl","174.cl","175.cl","176.cl","177.cl","178.cl","179.cl","180.cl","181.cl","182.cl","183.cl","184.cl","185.cl","186.cl","187.cl","188.cl","189.cl","190.cl","191.cl","192.cl","193.cl","194.cl","195.cl","196.cl","197.cl","198.cl","199.cl","200.cl","201.cl","202.cl","203.cl","204.cl","205.cl","206.cl","207.cl","208.cl","209.cl","210.cl","211.cl","212.cl","213.cl","214.cl","215.cl","216.cl","217.cl","218.cl","219.cl","220.cl","221.cl","222.cl","223.cl","224.cl","225.cl","226.cl","227.cl","228.cl","229.cl","230.cl","231.cl","232.cl","233.cl","234.cl","235.cl","236.cl","237.cl","238.cl","239.cl","240.cl","241.cl","242.cl","243.cl","244.cl","245.cl","246.cl","247.cl","248.cl","249.cl","250.cl","251.cl","252.cl","253.cl","254.cl","255.cl","256.cl","257.cl","258.cl","259.cl","260.cl","261.cl","262.cl","263.cl","264.cl","265.cl","266.cl","267.cl","268.cl","269.cl","270.cl","271.cl","272.cl","273.cl","274.cl","275.cl","276.cl","277.cl","278.cl","279.cl","280.cl","281.cl","282.cl","283.cl","284.cl","285.cl","286.cl","287.cl","288.cl","289.cl","290.cl","291.cl","292.cl","293.cl","294.cl","295.cl","296.cl","297.cl","298.cl","299.cl","300.cl","301.cl","302.cl","303.cl","304.cl","305.cl","306.cl","307.cl","308.cl","309.cl","310.cl","311.cl","312.cl","313.cl","314.cl","315.cl","316.cl","317.cl","318.cl","319.cl","320.cl","321.cl","322.cl","323.cl","324.cl","325.cl","326.cl","327.cl","328.cl","329.cl","330.cl","331.cl","332.cl","333.cl","334.cl","335.cl","336.cl","337.cl","338.cl","339.cl","340.cl","341.cl","342.cl","343.cl","344.cl","345.cl","346.cl","347.cl","348.cl","349.cl","350.cl","351.cl","352.cl","353.cl","354.cl","355.cl","356.cl","357.cl","358.cl","359.cl","360.cl","361.cl","362.cl","363.cl","364.cl","365.cl","366.cl","367.cl","368.cl","369.cl","370.cl","371.cl","372.cl","373.cl","374.cl","375.cl","376.cl","377.cl","378.cl","379.cl","380.cl","381.cl","382.cl","383.cl","384.cl","385.cl","386.cl","387.cl","388.cl","389.cl","390.cl","391.cl","392.cl","393.cl","394.cl","395.cl","396.cl","397.cl","398.cl","399.cl","400.cl","401.cl","402.cl","403.cl","404.cl","405.cl","406.cl","407.cl","408.cl","409.cl","410.cl","411.cl","412.cl","413.cl","414.cl","415.cl","416.cl","417.cl","418.cl","419.cl","420.cl","421.cl","422.cl","423.cl","424.cl","425.cl","426.cl","427.cl","428.cl","429.cl","430.cl","431.cl","432.cl","433.cl","434.cl","435.cl","436.cl","437.cl","438.cl","439.cl","440.cl","441.cl","442.cl","443.cl","444.cl","445.cl","446.cl","447.cl","448.cl","449.cl","450.cl","451.cl","452.cl","453.cl","454.cl","455.cl","456.cl","457.cl","458.cl","459.cl","460.cl","461.cl","462.cl","463.cl","464.cl","465.cl","466.cl","467.cl","468.cl","469.cl","470.cl","471.cl","472.cl","473.cl","474.cl","475.cl","476.cl","477.cl","478.cl","479.cl","480.cl","481.cl","482.cl","483.cl","484.cl","485.cl","486.cl","487.cl","488.cl","489.cl","490.cl","491.cl","492.cl","493.cl","494.cl","495.cl","496.cl","497.cl","498.cl","499.cl","500.cl","501.cl","502.cl","503.cl","504.cl","505.cl","506.cl","507.cl","508.cl","509.cl","510.cl","511.cl","512.cl","513.cl","514.cl","515.cl","516.cl","517.cl","518.cl","519.cl","520.cl","521.cl","522.cl","523.cl","524.cl","525.cl","526.cl","527.cl","528.cl","529.cl","530.cl","531.cl","532.cl","533.cl","534.cl","535.cl","536.cl","537.cl","538.cl","539.cl","540.cl","541.cl","542.cl","543.cl","544.cl","545.cl","546.cl","547.cl","548.cl","549.cl","550.cl","551.cl","552.cl","553.cl","554.cl","555.cl","556.cl","557.cl","558.cl","559.cl","560.cl","561.cl","562.cl","563.cl","564.cl","565.cl","566.cl","567.cl","568.cl","569.cl","570.cl","571.cl","572.cl","573.cl","574.cl","575.cl","576.cl","577.cl","578.cl","579.cl","580.cl","581.cl","582.cl","583.cl","584.cl","585.cl","586.cl","587.cl","588.cl","589.cl","590.cl","591.cl","592.cl","593.cl","594.cl","595.cl","596.cl","597.cl","598.cl","599.cl","600.cl","601.cl","602.cl","603.cl","604.cl","605.cl","606.cl","607.cl","608.cl","609.cl","610.cl","611.cl","612.cl","613.cl","614.cl","615.cl","616.cl","617.cl","618.cl","619.cl","620.cl","621.cl","622.cl","623.cl","624.cl","625.cl","626.cl","627.cl","628.cl","629.cl","630.cl","631.cl","632.cl","633.cl","634.cl","635.cl","636.cl","637.cl","638.cl","639.cl","640.cl","641.cl","642.cl","643.cl","644.cl","645.cl","646.cl","647.cl","648.cl","649.cl","650.cl","651.cl","652.cl","653.cl","654.cl","655.cl","656.cl","657.cl","658.cl","659.cl","660.cl","661.cl","662.cl","663.cl","664.cl","665.cl","666.cl","667.cl","668.cl","669.cl","670.cl","671.cl"};
        printf("start");
        int counts = 0;
        printf("end");
        for (int i = 0; i < 30000; i++) {
            //put the list into zero.

            memset(array_result, 0, sizeof(array_result));
            //Array counter is set to zero
            array_counting = 0;
            InitSeqList(&seqList);
            jduge_deal = 0;
            char url[100] = {"/home/fenghui/LLVM5.0/build/672cl头文件/"};
            strcat(url, greeting[i]);
            argv[1] = url;

            if (result == -1) {
                printf("Can't open the file: %s.\n", argv[1]);
                return -1;
            }

            numOfArgc = argc;
            if (numOfArgc == 3) {
                findingString = argv[2];
            }

            CXIndex Index = clang_createIndex(0, 0);
            CXTranslationUnit TU = clang_parseTranslationUnit(Index, 0, argv, argc,
                                                              0, 0,
                                                              CXTranslationUnit_None);
//    for (unsigned I = 0, N = clang_getNumDiagnostics(TU); I != N; ++I) {
//        CXDiagnostic Diag = clang_getDiagnostic(TU, I);
//        CXString String = clang_formatDiagnostic(Diag,clang_defaultDiagnosticDisplayOptions());
//        fprintf(stderr, "%s\n", clang_getCString(String));
//        clang_disposeString(String);
//    }
            //1.get the compiled clfile;
            CXCursor C = clang_getTranslationUnitCursor(TU);

            //2.output the first AST node name;
//            printSpelling(C);
//            //3.output the first AST node kind;
//            printKindSpelling(C);

            InitSerialization(C);
            //4.output the first AST node Location;
//    printLocation(C);
            //5.visit all nodes

            clang_visitChildren(C, printVisitor, NULL);
            int Max=array_counting;
            //节点总数
            addnode(Max,counts);
            type(&seqList, Max,counts);
            //6.add all child nodes.(1)this node must be no child;(2)the node's parent must be equal;
            AddSiblingNode(&seqList, Max,counts);
            //7.Add compute edge.(1)find Binary Operation;(2)find Binary Operation's parent;
            //(3)find binary operation's child;(4)Connect parent with child;
            AddComputeEdge(&seqList, Max,counts);
            //8.连接guarded_by and guarded_by_negation边.（1）查找父亲节点为ifstmt的全部子节点；（2）分析该节点拿到所有token;
            // (3)将第一个节点下的所有token放入一个数组当中(ifstmt的第一个节点是if中的条件)
            // (4)将第一个父节点为ifstmt之后的token进行比较,如果相等则将其与ifstmt相连接.
            //9.连接LastLexicalUse边.(1)查找父亲节点为ifstmt的全部子节点;
            // (2)从第二个父节点为ifstmt的节点开始,拿到其下的每一个token,存入数组中，进行比较，若相等，则进行连接.
            Addguarded_by(&seqList, Max,counts);
            //把return token用ReturnTo边连接到方法的声明上.
//            AddReturnTo(&seqList, Max,counts);
            //添加jump边，连接if跳转的关系
            Addjump(&seqList, Max,counts);
            Addlast_lexical_use(&seqList, Max,counts);
            DealWithArray(array_counting - 1, counts);
            counts++;
            //7.Destroy the specified CXTranslationUnit object;
            clang_disposeTranslationUnit(TU);
            //8.Destroy the given index.
            clang_disposeIndex(Index);
            //}
        }
        return 0;
    }
}
void addnode(int list_Length,int count){
    FILE* fp;
    char url[100] = {};
    char urls[100] = {"/home/fenghui/LLVM5.0/build/最大节点数/"};

    itoa(count,url,10);
    strcat(url, ".txt");
    strcat(urls, url);

    /*打开文本文件以写入内容*/
    fp = fopen(urls, "a");
    if (!fp)
    {
        perror("cannot open file");
        //exit(-1);
    }

    /*把二维数组的内容写入文件*/
    fprintf(fp,"%d",list_Length+1);

    fclose(fp);
}



void Addjump(PSeqList pSeqList, int list_Length,int count) {
    assert(pSeqList);//判断指针是否为空
    if (pSeqList->size == 0) {
        printf("线性表为空\n");
    }
    for (int i = 0; i <= list_Length; i++) {
        if (strcmp(printbinspelling(pSeqList->array[i].list_data), "IfStmt") == 0) {
            DataType dataType_04;
            Initial(dataType_04);
            dataType_04.list_data = pSeqList->array[i].list_data;
            int ifstmt = Find(&seqList, dataType_04);
            //第几次进入IfStmt树。
            int counting = 1;
            for (int j = i; j < list_Length; j++) {
                DataType dataType;
                Initial(dataType);
                dataType.list_data = pSeqList->array[j].parentNode;
                if (ifstmt == Find(&seqList, dataType)){
                    if (strcmp(printbinspelling(pSeqList->array[Find(&seqList, dataType)].list_data),
                               "IfStmt") == 0){
                        if (counting == 1){
                            for (int k = j + 1; k <= list_Length; k++) {
                                //如果第二个结点的父亲结点是Iftmt的话,直接跳出去.
                                DataType dataType_02;
                                Initial(dataType_02);
                                dataType_02.list_data = pSeqList->array[k].parentNode;
                                if (strcmp(printbinspelling(pSeqList->array[Find(&seqList, dataType_02)].list_data),
                                           "IfStmt") == 0) {
                                    break;
                                }
                            }
                        }
                        if(counting == 2){
                            array_result[array_counting][0] = ifstmt;
                            array_result[array_counting][1] = j;
                            array_counting++;
                            FILE* fp;
                            char url[100] = {};
                            char urls[100] = {"/home/fenghui/LLVM5.0/build/1w三边边类型/"};

                            itoa(count,url,10);
                            strcat(url, ".txt");
                            strcat(urls, url);

                            /*打开文本文件以写入内容*/
                            fp = fopen(urls, "a");
                            if (!fp)
                            {
                                perror("cannot open file");
                                //exit(-1);
                            }

                            /*把二维数组的内容写入文件*/
                            fprintf(fp,"jump;");

                            fclose(fp);
                            for (int k = j + 1; k <= list_Length; k++){
                                DataType dataType_03;
                                Initial(dataType_03);
                                dataType_03.list_data = pSeqList->array[k].parentNode;
                                if (strcmp(printbinspelling(pSeqList->array[Find(&seqList, dataType_03)].list_data),
                                           "IfStmt") == 0) {
                                    break;
                                }
                            }
                        }
                        if(counting == 3){
                            array_result[array_counting][0] = ifstmt;
                            array_result[array_counting][1] = j;
                            array_counting++;
                            FILE* fp;
                            char url[100] = {};
                            char urls[100] = {"/home/fenghui/LLVM5.0/build/1w三边边类型/"};

                            itoa(count,url,10);
                            strcat(url, ".txt");
                            strcat(urls, url);

                            /*打开文本文件以写入内容*/
                            fp = fopen(urls, "a");
                            if (!fp)
                            {
                                perror("cannot open file");
                                //exit(-1);
                            }

                            /*把二维数组的内容写入文件*/
                            fprintf(fp,"jump;");

                            fclose(fp);
                            for (int k = j + 1; k <= list_Length; k++){
                                DataType dataType_03;
                                Initial(dataType_03);
                                dataType_03.list_data = pSeqList->array[k].parentNode;
                                if (strcmp(printbinspelling(pSeqList->array[Find(&seqList, dataType_03)].list_data),
                                           "IfStmt") == 0) {
                                    break;
                                }
                            }
                        }
                        counting++;
                    }
                }
            }
        }
    }
}



void type(PSeqList pSeqList, int list_Length,int count) {
    assert(pSeqList);//判断指针是否为空
    if (pSeqList->size == 0) {
        printf("线性表为空\n");
    }
    for (int i = 0; i<=list_Length-1; i++){
        FILE* fp;
        char url[100] = {};
        char urls[100] = {"/home/fenghui/LLVM5.0/build/1w三边边类型/"};

        itoa(count,url,10);
        strcat(url, ".txt");
        strcat(urls, url);

        /*打开文本文件以写入内容*/
        fp = fopen(urls, "a");
        if (!fp)
        {
            perror("cannot open file");
            //exit(-1);
        }

        /*把二维数组的内容写入文件*/
        fprintf(fp,"child;");

        fclose(fp);

    }

}

void AddReturnTo(PSeqList pSeqList, int list_Length,int count) {
    assert(pSeqList);//判断指针是否为空
    if (pSeqList->size == 0) {
        printf("线性表为空\n");
    }
    for (int i = 0; i<=list_Length; i++){
        if (strcmp(printbinspelling(pSeqList->array[i].list_data), "ReturnStmt") == 0) {
            DataType dataType;
            Initial(dataType);
            dataType.list_data = pSeqList->array[i].list_data;
            int returnstmt = Find(&seqList, dataType);
            array_result[array_counting][0] = 1;
            array_result[array_counting][1] = returnstmt;
            array_counting++;
            FILE* fp;
            char url[100] = {};
            char urls[100] = {"/home/fenghui/LLVM5.0/build/1w三边边类型/"};

            itoa(count,url,10);
            strcat(url, ".txt");
            strcat(urls, url);

            /*打开文本文件以写入内容*/
            fp = fopen(urls, "a");
            if (!fp)
            {
                perror("cannot open file");
                //exit(-1);
            }

            /*把二维数组的内容写入文件*/
            fprintf(fp,"return_to;");

            fclose(fp);
        }
    }

}

void Addlast_lexical_use(PSeqList pSeqList, int list_Length,int count) {
    assert(pSeqList);//判断指针是否为空
    if (pSeqList->size == 0) {
        printf("线性表为空\n");
    }
    for (int i = 0; i <= list_Length; i++) {
        if (strcmp(printbinspelling(pSeqList->array[i].list_data), "IfStmt") == 0) {
            DataType dataType_04;
            Initial(dataType_04);
            dataType_04.list_data = pSeqList->array[i].list_data;
            int ifstmt = Find(&seqList, dataType_04);
            //第几次进入IfStmt树。
            int counting = 1;
            //
            int *Lex_token;
            Lex_token = (char *) malloc(sizeof(char) * 1000);
            memset(Lex_token, '\0', sizeof(char) * 1000);
            int lextoken = 0;

            char *Lexicaluse;
            Lexicaluse = (char *) malloc(sizeof(char) * 1000);
            memset(Lexicaluse, '\0', sizeof(char) * 1000);
            int lastlexical = 0;

            char *StorageString;
            StorageString = (char *) malloc(sizeof(char) * 1000);
            memset(StorageString, '\0', sizeof(char) * 1000);
            int countingStr = 0;
            for (int j = i; j < list_Length; j++) {
                DataType dataType;
                Initial(dataType);
                dataType.list_data = pSeqList->array[j].parentNode;
                if (ifstmt == Find(&seqList, dataType)){
                    if (strcmp(printbinspelling(pSeqList->array[Find(&seqList, dataType)].list_data),
                               "IfStmt") == 0) {
                        if (counting == 1) {
                            for (int k = j + 1; k <= list_Length; k++) {
                                //如果第二个结点的父亲结点是Iftmt的话,直接跳出去.
                                DataType dataType_02;
                                Initial(dataType_02);
                                dataType_02.list_data = pSeqList->array[k].parentNode;
                                if (strcmp(printbinspelling(pSeqList->array[Find(&seqList, dataType_02)].list_data),
                                           "IfStmt") == 0) {
                                    break;
                                } else {
                                    //1.判断没有孩子结点2.且该结点的Speeling不为空。
                                    if (!pSeqList->array[k].haschild &&
                                        (strcmp(printSpelling(pSeqList->array[k].list_data), "") != 0)) {
                                        char *testing = printSpelling(pSeqList->array[k].list_data);
                                        StorageString[countingStr] = *testing;

                                        countingStr++;
                                    }
                                }
                            }
                        }
                        if(counting == 2) {
                            for (int k = j + 1; k <= list_Length; k++) {
                                DataType dataType_03;
                                Initial(dataType_03);
                                dataType_03.list_data = pSeqList->array[k].parentNode;
                                if (strcmp(printbinspelling(pSeqList->array[Find(&seqList, dataType_03)].list_data),
                                           "IfStmt") == 0) {
                                    break;
                                } else {
                                    if (!pSeqList->array[k].haschild &&
                                        (strcmp(printSpelling(pSeqList->array[k].list_data), "") != 0)) {
                                        char *test = printSpelling(pSeqList->array[k].list_data);
                                        DataType dataType_06;
                                        Initial(dataType_06);
                                        dataType_06.list_data = pSeqList->array[k].list_data;
                                        int t = Find(&seqList, dataType_06);
                                        Lexicaluse[lastlexical] = *test;
                                        Lex_token[lextoken] = t;

                                        lastlexical++;
                                        lextoken++;
                                        char *testing01 = printSpelling(pSeqList->array[k].list_data);
                                    }
                                }

                            }
                        }
                        if(counting == 3) {
                            for (int k = j + 1; k <= list_Length; k++) {
                                DataType dataType_03;
                                Initial(dataType_03);
                                dataType_03.list_data = pSeqList->array[k].parentNode;
                                if (strcmp(printbinspelling(pSeqList->array[Find(&seqList, dataType_03)].list_data),
                                           "IfStmt") == 0) {
                                    break;
                                } else {
                                    if (!pSeqList->array[k].haschild &&
                                        (strcmp(printSpelling(pSeqList->array[k].list_data), "") != 0)) {
                                        char *testing02 = printSpelling(pSeqList->array[k].list_data);
                                        for(int z = 0; z < lastlexical; z++){
                                            if (Lexicaluse[z] == *testing02){
                                                int thirdifstmt = k;
                                                array_result[array_counting][0] = Lex_token[z];
                                                array_result[array_counting][1] = thirdifstmt;
                                                array_counting++;
                                                FILE* fp;
                                                char url[100] = {};
                                                char urls[100] = {"/home/fenghui/LLVM5.0/build/1w三边边类型/"};

                                                itoa(count,url,10);
                                                strcat(url, ".txt");
                                                strcat(urls, url);

                                                /*打开文本文件以写入内容*/
                                                fp = fopen(urls, "a");
                                                if (!fp)
                                                {
                                                    perror("cannot open file");
                                                    //exit(-1);
                                                }

                                                /*把二维数组的内容写入文件*/
                                                fprintf(fp,"last_lexical_use;");

                                                fclose(fp);
                                            }
                                        }
                                    }
                                }

                            }
                        }
                        counting++;
                    }
                }
            }
            free(StorageString);
        }
    }

}



void Addguarded_by(PSeqList pSeqList, int list_Length,int count) {
    assert(pSeqList);//判断指针是否为空
    if (pSeqList->size == 0) {
        printf("线性表为空\n");
    }
    for (int i = 0; i <= list_Length; i++) {
        if (strcmp(printbinspelling(pSeqList->array[i].list_data), "IfStmt") == 0) {
            DataType dataType_04;
            Initial(dataType_04);
            dataType_04.list_data = pSeqList->array[i].list_data;
            int ifstmt = Find(&seqList, dataType_04);
            //第几次进入IfStmt树。
            int counting = 1;
            //
            int *Lex_token;
            Lex_token = (char *) malloc(sizeof(char) * 1000);
            memset(Lex_token, '\0', sizeof(char) * 1000);
            int lextoken = 0;

            char *Lexicaluse;
            Lexicaluse = (char *) malloc(sizeof(char) * 1000);
            memset(Lexicaluse, '\0', sizeof(char) * 1000);
            int lastlexical = 0;

            char *StorageString;
            StorageString = (char *) malloc(sizeof(char) * 1000);
            memset(StorageString, '\0', sizeof(char) * 1000);
            int countingStr = 0;
            for (int j = i; j < list_Length; j++) {
                DataType dataType;
                Initial(dataType);
                dataType.list_data = pSeqList->array[j].parentNode;
                if (ifstmt == Find(&seqList, dataType)){
                    if (strcmp(printbinspelling(pSeqList->array[Find(&seqList, dataType)].list_data),
                               "IfStmt") == 0) {
                        if (counting == 1) {
                            for (int k = j + 1; k <= list_Length; k++) {
                                //如果第二个结点的父亲结点是Iftmt的话,直接跳出去.
                                DataType dataType_02;
                                Initial(dataType_02);
                                dataType_02.list_data = pSeqList->array[k].parentNode;
                                if (strcmp(printbinspelling(pSeqList->array[Find(&seqList, dataType_02)].list_data),
                                           "IfStmt") == 0) {
                                    break;
                                } else {
                                    //1.判断没有孩子结点2.且该结点的Speeling不为空。
                                    if (!pSeqList->array[k].haschild &&
                                        (strcmp(printSpelling(pSeqList->array[k].list_data), "") != 0)) {
                                        char *testing = printSpelling(pSeqList->array[k].list_data);
                                        StorageString[countingStr] = *testing;

                                        countingStr++;
                                    }
                                }
                            }
                        }
                        if(counting == 2) {
                            for (int k = j + 1; k <= list_Length; k++) {
                                DataType dataType_03;
                                Initial(dataType_03);
                                dataType_03.list_data = pSeqList->array[k].parentNode;
                                if (strcmp(printbinspelling(pSeqList->array[Find(&seqList, dataType_03)].list_data),
                                           "IfStmt") == 0) {
                                    break;
                                } else {
                                    if (!pSeqList->array[k].haschild &&
                                        (strcmp(printSpelling(pSeqList->array[k].list_data), "") != 0)) {
                                        char *test = printSpelling(pSeqList->array[k].list_data);
                                        DataType dataType_06;
                                        Initial(dataType_06);
                                        dataType_06.list_data = pSeqList->array[k].list_data;
                                        int t = Find(&seqList, dataType_06);
                                        Lexicaluse[lastlexical] = *test;
                                        Lex_token[lextoken] = t;

                                        lastlexical++;
                                        lextoken++;
                                        char *testing01 = printSpelling(pSeqList->array[k].list_data);
                                        for (int i = 0; i < countingStr; i++) {
                                            if (StorageString[i] == *testing01) {
                                                int secondifstmt = k;
                                                array_result[array_counting][0] = ifstmt;
                                                array_result[array_counting][1] = secondifstmt;
                                                array_counting++;
                                                FILE* fp;
                                                char url[100] = {};
                                                char urls[100] = {"/home/fenghui/LLVM5.0/build/1w三边边类型/"};

                                                itoa(count,url,10);
                                                strcat(url, ".txt");
                                                strcat(urls, url);

                                                /*打开文本文件以写入内容*/
                                                fp = fopen(urls, "a");
                                                if (!fp)
                                                {
                                                    perror("cannot open file");
                                                    //exit(-1);
                                                }

                                                /*把二维数组的内容写入文件*/
                                                fprintf(fp,"guarded;");

                                                fclose(fp);

                                            }
                                        }
                                    }
                                }

                            }
                        }
                        if(counting == 3) {
                            for (int k = j + 1; k <= list_Length; k++) {
                                DataType dataType_03;
                                Initial(dataType_03);
                                dataType_03.list_data = pSeqList->array[k].parentNode;
                                if (strcmp(printbinspelling(pSeqList->array[Find(&seqList, dataType_03)].list_data),
                                           "IfStmt") == 0) {
                                    break;
                                } else {
                                    if (!pSeqList->array[k].haschild &&
                                        (strcmp(printSpelling(pSeqList->array[k].list_data), "") != 0)) {
                                        char *testing02 = printSpelling(pSeqList->array[k].list_data);
                                        for (int i = 0; i < countingStr; i++) {
                                            if (StorageString[i] == *testing02) {
                                                int secondifstmt = k;
                                                array_result[array_counting][0] = ifstmt;
                                                array_result[array_counting][1] = secondifstmt;
                                                array_counting++;
                                                FILE* fp;
                                                char url[100] = {};
                                                char urls[100] = {"/home/fenghui/LLVM5.0/build/1w三边边类型/"};

                                                itoa(count,url,10);
                                                strcat(url, ".txt");
                                                strcat(urls, url);

                                                /*打开文本文件以写入内容*/
                                                fp = fopen(urls, "a");
                                                if (!fp)
                                                {
                                                    perror("cannot open file");
                                                    //exit(-1);
                                                }

                                                /*把二维数组的内容写入文件*/
                                                fprintf(fp,"guarded;");

                                                fclose(fp);
                                            }
                                        }
                                    }
                                }

                            }
                        }
                        counting++;
                    }
            }
        }
            free(StorageString);
        }
    }

}

//void Addguarded_by(PSeqList pSeqList, int list_Length) {
//    assert(pSeqList);//判断指针是否为空
//    if (pSeqList->size == 0) {
//        printf("线性表为空\n");
//    }
//    for (int i = 0; i <= list_Length; i++) {
//        if (strcmp(printbinspelling(pSeqList->array[i].list_data), "IfStmt") == 0) {
//            printf("guarded_by:%d\n",i);
//        }
//    }
//}

void InitSerialization(CXCursor t1) {
//测试Insert,Erase,Remove,RemoveALL函数
    /*test1(&seqList);*/
    /*test2(&seqList);*/
    DataType dataType_1st;
    dataType_1st.list_data = t1;
    InitSeqList(&seqList);
    PushBack(&seqList, dataType_1st);//在首部加入1
    int ret = Find(&seqList, dataType_1st);
}

void AddComputeEdge(PSeqList pSeqList, int list_Length,int count) {
    assert(pSeqList);//判断指针是否为空
    if (pSeqList->size == 0) {
        printf("线性表为空\n");
    }

    for (int i = 0; i <= list_Length; i++) {
        if (strcmp(printbinspelling(pSeqList->array[i].list_data), "BinaryOperator") == 0) {
            //printf("BinaryOperator is:%d\n", i);
            //拼凑一个结构体
            DataType dataType;
            Initial(dataType);
            dataType.list_data = pSeqList->array[i].parentNode;
            //在链表中查找元素
            int firstelement = Find(&seqList, dataType);
            for (int j = firstelement; j <= list_Length; j++) {
                DataType dataType1;
                Initial(dataType1);
                dataType1.list_data = pSeqList->array[j].parentNode;
                int parentpos = Find(&seqList, dataType1);
                if ((strcmp(printbinspelling(pSeqList->array[parentpos].list_data), "BinaryOperator") == 0)
                    && checkSim(pSeqList->array[j].parentNode, pSeqList->array[i].list_data)) {
                    int secondelement = j;
                    array_result[array_counting][0] = firstelement;
                    array_result[array_counting][1] = secondelement;
                    array_counting++;
                    FILE* fp;
                    char url[100] = {};
                    char urls[100] = {"/home/fenghui/LLVM5.0/build/1w三边边类型/"};

                    itoa(count,url,10);
                    strcat(url, ".txt");
                    strcat(urls, url);

                    /*打开文本文件以写入内容*/
                    fp = fopen(urls, "a");
                    if (!fp)
                    {
                        perror("cannot open file");
                        //exit(-1);
                    }

                    /*把二维数组的内容写入文件*/
                    fprintf(fp,"compute_from;");

                    fclose(fp);
                }

            }
//
            // Find(pSeqList,pSeqList->array[i].parentNode);
            // array_result[array_counting][0] = pSeqList->array[i].parentNode;
        }
    }
}

void AddSiblingNode(PSeqList pSeqList, int list_Length,int count) {
    assert(pSeqList);//判断指针是否为空
    if (pSeqList->size == 0) {
        printf("线性表为空\n");
    }

    for (int i = 0; i <= list_Length; i++) {
        if (!pSeqList->array[i].haschild) {
            for (int j = i + 1; j <= list_Length; j++) {
                if (!pSeqList->array[j].haschild) {
                    if (checkSim(pSeqList->array[i].parentNode, pSeqList->array[j].parentNode)) {
                        array_result[array_counting][0] = i;//-77106
                        array_result[array_counting][1] = j;//-77106
                        array_counting++;
                        FILE* fp;
                        char url[100] = {};
                        char urls[100] = {"/home/fenghui/LLVM5.0/build/1w三边边类型/"};

                        itoa(count,url,10);
                        strcat(url, ".txt");
                        strcat(urls, url);

                        /*打开文本文件以写入内容*/
                        fp = fopen(urls, "a");
                        if (!fp)
                        {
                            perror("cannot open file");
                            //exit(-1);
                        }

                        /*把二维数组的内容写入文件*/
                        fprintf(fp,"next_token;");

                        fclose(fp);
                        break;
                    }
                }
            }
        }
    }
}
//void AddBinaryOperator(PSeqList pSeqList,int list_length){
//  assert(pSeqList);//判断指针是否为空
//  if (pSeqList->size == 0)
//  {
//      printf("线性表为空\n");
//  }
//  for(int z=0;z<=list_length;z++){

//  }
//}


bool checkSim(CXCursor node, CXCursor parentNode) {
    if (node.xdata != parentNode.xdata) {
        return false;
    } else if (node.kind != parentNode.kind) {
        return false;
    } else if (node.data[0] != parentNode.data[0]) {
        return false;
    } else if (node.data[1] != parentNode.data[1]) {
        return false;
    } else if (node.data[2] != parentNode.data[2]) {
        return false;
    }
    return true;
}

void DealWithArray(int array_Length, int count) {
//    memset(array_result,0, sizeof(array_result));
    printf("The array_length is:%d\n", array_Length);
    int max = 0;
    FILE* fp;
    int i, j;
    char url[100] = {};
    char urls[100] = {"/home/fenghui/LLVM5.0/build/1w七边邻接表/"};
    itoa(count,url,10);
    strcat(url, ".txt");
    strcat(urls, url);

    /*打开文本文件以写入内容*/
    fp = fopen(urls, "w");
    if (!fp)
    {
        perror("cannot open file");
        //exit(-1);
    }

    /*把二维数组的内容写入文件*/
    for (int i = 0; i <= array_Length; i++) {
        fprintf(fp, "(%d,%d);", array_result[i][0], array_result[i][1]);
    }
    fclose(fp);


    //PareseMatrix(array_result, array_Length + 1, max + 1, count);
}


void Init_Serialization(CXCursor t1) {//测试Insert,Erase,Remove,RemoveALL函数
    /*test1(&seqList);*/
    /*test2(&seqList);*/
    DataType dataType_1st;
    dataType_1st.list_data = t1;
    InitSeqList(&seqList);
    PushBack(&seqList, dataType_1st);//在首部加入1
    int ret = Find(&seqList, dataType_1st);
//    printf("AST node Numbering:%d\n", ret);
//    PrintSeqList(seqList);
//    Erase(seqList, 3);//删除下标3位置上的元素
//    PrintSeqList(seqList);
//    Insert(seqList, 3, 2);
//    Insert(seqList, 3, 2);
//    PrintSeqList(seqList);
//    Remove(seqList, 2);//删除第一个 2
//    PrintSeqList(seqList);
//    RemoveAll(seqList, 2);//删除所有的 2
//    PrintSeqList(seqList);
}


void test(){
    if(i > 1){
        i++;
    }
    else{
        i--;
    }
}= pSeqList->array[k].parentNode;
                                if (strcmp(printbinspelling(pSeqList->array[Find(&seqList, dataType_03)].list_data),
                                           "IfStmt") == 0) {
                                    break;
                                } else {
                                    if (!pSeqList->array[k].haschild &&
                                        (strcmp(printSpelling(pSeqList->array[k].list_data), "") != 0)) {
                                        char *testing02 = printSpelling(pSeqList->array[k].list_data);
                                        for (int i = 0; i < countingStr; i++) {
                                            if (StorageString[i] == *testing02) {
                                                int secondifstmt = k;
                                                array_result[array_counting][0] = ifstmt;
                                                array_result[array_counting][1] = secondifstmt;
                                                array_counting++;
                                                FILE* fp;
                                                char url[100] = {};
                                                char urls[100] = {"/home/fenghui/LLVM5.0/build/1w三边边类型/"};

                                                itoa(count,url,10);
                                                strcat(url, ".txt");
                                                strcat(urls, url);

                                                /*打开文本文件以写入内容*/
                                                fp = fopen(urls, "a");
                                                if (!fp)
                                                {
                                                    perror("cannot open file");
                                                    //exit(-1);
                                                }

                                                /*把二维数组的内容写入文件*/
                                                fprintf(fp,"guarded;");

                                                fclose(fp);
                                            }
                                        }
                                    }
                                }

                            }
                        }
                        counting++;
                    }
            }
        }
            free(StorageString);
        }
    }

}

//void Addguarded_by(PSeqList pSeqList, int list_Length) {
//    assert(pSeqList);//判断指针是否为空
//    if (pSeqList->size == 0) {
//        printf("线性表为空\n");
//    }
//    for (int i = 0; i <= list_Length; i++) {
//        if (strcmp(printbinspelling(pSeqList->array[i].list_data), "IfStmt") == 0) {
//            printf("guarded_by:%d\n",i);
//        }
//    }
//}

void InitSerialization(CXCursor t1) {
//测试Insert,Erase,Remove,RemoveALL函数
    /*test1(&seqList);*/
    /*test2(&seqList);*/
    DataType dataType_1st;
    dataType_1st.list_data = t1;
    InitSeqList(&seqList);
    PushBack(&seqList, dataType_1st);//在首部加入1
    int ret = Find(&seqList, dataType_1st);
}

void AddComputeEdge(PSeqList pSeqList, int list_Length,int count) {
    assert(pSeqList);//判断指针是否为空
    if (pSeqList->size == 0) {
        printf("线性表为空\n");
    }

    for (int i = 0; i <= list_Length; i++) {
        if (strcmp(printbinspelling(pSeqList->array[i].list_data), "BinaryOperator") == 0) {
            //printf("BinaryOperator is:%d\n", i);
            //拼凑一个结构体
            DataType dataType;
            Initial(dataType);
            dataType.list_data = pSeqList->array[i].parentNode;
            //在链表中查找元素
            int firstelement = Find(&seqList, dataType);
            for (int j = firstelement; j <= list_Length; j++) {
                DataType dataType1;
                Initial(dataType1);
                dataType1.list_data = pSeqList->array[j].parentNode;
                int parentpos = Find(&seqList, dataType1);
                if ((strcmp(printbinspelling(pSeqList->array[parentpos].list_data), "BinaryOperator") == 0)
                    && checkSim(pSeqList->array[j].parentNode, pSeqList->array[i].list_data)) {
                    int secondelement = j;
                    array_result[array_counting][0] = firstelement;
                    array_result[array_counting][1] = secondelement;
                    array_counting++;
                    FILE* fp;
                    char url[100] = {};
                    char urls[100] = {"/home/fenghui/LLVM5.0/build/1w三边边类型/"};

                    itoa(count,url,10);
                    strcat(url, ".txt");
                    strcat(urls, url);

                    /*打开文本文件以写入内容*/
                    fp = fopen(urls, "a");
                    if (!fp)
                    {
                        perror("cannot open file");
                        //exit(-1);
                    }

                    /*把二维数组的内容写入文件*/
                    fprintf(fp,"compute_from;");

                    fclose(fp);
                }

            }
//
            // Find(pSeqList,pSeqList->array[i].parentNode);
            // array_result[array_counting][0] = pSeqList->array[i].parentNode;
        }
    }
}

void AddSiblingNode(PSeqList pSeqList, int list_Length,int count) {
    assert(pSeqList);//判断指针是否为空
    if (pSeqList->size == 0) {
        printf("线性表为空\n");
    }

    for (int i = 0; i <= list_Length; i++) {
        if (!pSeqList->array[i].haschild) {
            for (int j = i + 1; j <= list_Length; j++) {
                if (!pSeqList->array[j].haschild) {
                    if (checkSim(pSeqList->array[i].parentNode, pSeqList->array[j].parentNode)) {
                        array_result[array_counting][0] = i;//-77106
                        array_result[array_counting][1] = j;//-77106
                        array_counting++;
                        FILE* fp;
                        char url[100] = {};
                        char urls[100] = {"/home/fenghui/LLVM5.0/build/1w三边边类型/"};

                        itoa(count,url,10);
                        strcat(url, ".txt");
                        strcat(urls, url);

                        /*打开文本文件以写入内容*/
                        fp = fopen(urls, "a");
                        if (!fp)
                        {
                            perror("cannot open file");
                            //exit(-1);
                        }

                        /*把二维数组的内容写入文件*/
                        fprintf(fp,"next_token;");

                        fclose(fp);
                        break;
                    }
                }
            }
        }
    }
}
//void AddBinaryOperator(PSeqList pSeqList,int list_length){
//  assert(pSeqList);//判断指针是否为空
//  if (pSeqList->size == 0)
//  {
//      printf("线性表为空\n");
//  }
//  for(int z=0;z<=list_length;z++){

//  }
//}


bool checkSim(CXCursor node, CXCursor parentNode) {
    if (node.xdata != parentNode.xdata) {
        return false;
    } else if (node.kind != parentNode.kind) {
        return false;
    } else if (node.data[0] != parentNode.data[0]) {
        return false;
    } else if (node.data[1] != parentNode.data[1]) {
        return false;
    } else if (node.data[2] != parentNode.data[2]) {
        return false;
    }
    return true;
}

void DealWithArray(int array_Length, int count) {
//    memset(array_result,0, sizeof(array_result));
    printf("The array_length is:%d\n", array_Length);
    int max = 0;
    FILE* fp;
    int i, j;
    char url[100] = {};
    char urls[100] = {"/home/fenghui/LLVM5.0/build/1w七边邻接表/"};
    itoa(count,url,10);
    strcat(url, ".txt");
    strcat(urls, url);

    /*打开文本文件以写入内容*/
    fp = fopen(urls, "w");
    if (!fp)
    {
        perror("cannot open file");
        //exit(-1);
    }

    /*把二维数组的内容写入文件*/
    for (int i = 0; i <= array_Length; i++) {
        fprintf(fp, "(%d,%d);", array_result[i][0], array_result[i][1]);
    }
    fclose(fp);


    //PareseMatrix(array_result, array_Length + 1, max + 1, count);
}


void Init_Serialization(CXCursor t1) {//测试Insert,Erase,Remove,RemoveALL函数
    /*test1(&seqList);*/
    /*test2(&seqList);*/
    DataType dataType_1st;
    dataType_1st.list_data = t1;
    InitSeqList(&seqList);
    PushBack(&seqList, dataType_1st);//在首部加入1
    int ret = Find(&seqList, dataType_1st);
//    printf("AST node Numbering:%d\n", ret);
//    PrintSeqList(seqList);
//    Erase(seqList, 3);//删除下标3位置上的元素
//    PrintSeqList(seqList);
//    Insert(seqList, 3, 2);
//    Insert(seqList, 3, 2);
//    PrintSeqList(seqList);
//    Remove(seqList, 2);//删除第一个 2
//    PrintSeqList(seqList);
//    RemoveAll(seqList, 2);//删除所有的 2
//    PrintSeqList(seqList);
}


void test(){
    if(i > 1){
        i++;
    }
    else{
        i--;
    }
}
