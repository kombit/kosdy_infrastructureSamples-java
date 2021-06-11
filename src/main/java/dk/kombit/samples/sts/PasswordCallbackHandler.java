package dk.kombit.samples.sts;

import dk.kombit.samples.utils.ClientProperties;
import org.apache.wss4j.common.ext.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;

/**
 * This class is a standard way of providing password to keystores in CXF.
 */
public class PasswordCallbackHandler implements CallbackHandler {

    private String password;

    @Override
    public void handle(final Callback[] callbacks) {
        for (Callback callback : callbacks) {
            if (callback instanceof WSPasswordCallback) {
                WSPasswordCallback wsPasswordCallback = (WSPasswordCallback) callback;
                if (wsPasswordCallback.getUsage() == WSPasswordCallback.DECRYPT || wsPasswordCallback.getUsage() == WSPasswordCallback.SIGNATURE) {
                    wsPasswordCallback.setPassword(getPassword());
                }
            }
        }
    }

    private String getPassword() {
        if (password == null) {
            password = ClientProperties.getInstance().getKeystorePassword();
        }

        return password;
    }
}
