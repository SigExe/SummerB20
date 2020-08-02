package day10_If_Statements;

/* status code:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable */

public class httpsStatusCode {

    public static void main(String[] args) {
        int code = 200;
        String status = "";

        if(code == 200){
            status = "OK";
        } else if(code == 210){
            status = "Created";
        } else if(code == 202){
            status = "Accepted";
        } else if(code == 301){
            status = "Moved Permanently";
        } else if(code == 303){
            status = "See Other";
        } else if(code == 304){
            status = "Not Modified";
        } else if(code == 307){
            status = "Temporary Redirect";
        } else if(code == 400){
            status = "Bad Request";
        } else if(code == 401){
            status = "Unauthorized";
        } else if(code == 403){
            status ="Forbidden";
        } else if(code == 404){
            status = "Not Found";
        } else if(code == 410){
            status = "Gone";
        } else if(code == 500){
            status = "Internal Service Error";
        } else if(code == 503){
            status = "Service Unavailable";
        }

        System.out.println(status);




    }




}
