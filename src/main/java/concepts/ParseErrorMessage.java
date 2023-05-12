package concepts;

public class ParseErrorMessage {
    public static void main(String[] args) {
        String error = "java.io.IOException: java.util.concurrent.ExecutionException: com.microsoft.aad.msal4j.MsalServiceException: AADSTS700016: Application with identifier 'ae1e7d05-d775-43f3-9fdb-468e35705acfff' was not found in the directory 'Automationanywhere Store'. This can happen if the application has not been installed by the administrator of the tenant or consented to by any user in the tenant. You may have sent your authentication request to the wrong tenant.\n" +
                "Trace ID: 0add8ff8-1ca4-4c66-9717-ce97520bb900\n" +
                "Correlation ID: da72973d-ae5b-46f3-888e-68861456dc72\n" +
                "Timestamp: 2023-02-02 07:21:23Z";
        int errorindex = error.indexOf("MsalServiceException");
        int sdkindex = error.indexOf("Trace ID");

        String message = error.substring(errorindex+21,sdkindex);
        System.out.println(message);
    }
}
