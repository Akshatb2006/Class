 class ExceptionHandle {
    public static void main(String[] args) throws ArithmeticException{
        try{// if we r expecting some exception
             if(5>4){
                throw new ArithmeticException("Custom Exception");
             }
        }
        catch(ArithmeticException e){
             System.out.println(e);
        }
        finally{//we r doing the common task here so it will run always
            System.out.println("All resources detached");
        }
        System.out.println("Server not crashed");
    }
}
