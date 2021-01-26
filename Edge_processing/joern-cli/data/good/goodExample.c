void goodExample(int b, char *c){ 
     a = (char*)malloc(b+1);
     if(!strcmp(c,"dateadded")){
         printf("not equal.");
         free(a);
     }    
     else {
         printf("equal.");
         free(a);
     }
}
