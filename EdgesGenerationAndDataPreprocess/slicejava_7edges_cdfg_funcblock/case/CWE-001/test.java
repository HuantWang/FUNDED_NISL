public class test{
    private void goodG2B() throws Throwable {
        String data;
        data = "foo";
        (new CWE89_SQL_Injection__listen_tcp_executeQuery_53b()).goodG2BSink(data);
    }

    public void checkPermission(String absPath){
        if (!hasPermission(absPath, actions)) {
            throw new AccessControlException(actions);
        }
    }

}