package concepts;

public class FindString {
    public static void main(String[] args) {
        String str = "Server side Failed rc: ChilkatLog:  SelectMailbox(250ms):    DllDate: Jun 24 2022    ChilkatVersion: 9.5.0.91    UnlockPrefix: AUTANY.CB8032023    Architecture: Little Endian; 64-bit    Language: Windows Java    VerboseLogging: 1    mailbox: Inbox    selectMailboxInner(250ms):      mailboxPath: Inbox      separatorChar: .      Escaping quotes and backslashes in mailbox name...      utf7EncodedMailboxPath: Inbox      ImapCmdSent: aaac SELECT \"Inbox\"      getCompleteResponse(250ms):        ImapCmdResp: aaac BAD User is authenticated but not connected.      --getCompleteResponse      isOK:        serverResponse: aaac BAD User is authenticated but not connected.      --isOK    --selectMailboxInner    Failed to select/examine mailbox    mailbox: Inbox    imapSelectResponse: aaac BAD User is authenticated but not connected.    Failed.  --SelectMailbox--ChilkatLog";
        int index = str.indexOf("serverResponse:");
//        if (index> 0){
//            String result = str.substring(index,str.indexOf("."));
//            System.out.println(result);
//        }
    }
}
