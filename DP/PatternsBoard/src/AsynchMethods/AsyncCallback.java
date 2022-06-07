/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AsynchMethods;

import java.util.Optional;
import java.util.concurrent.ExecutionException;
/**
 *
 * @author Mukhtiar
 */
public interface AsyncCallback {
    void onComplete(T value, Optional<Exception> ex);
}
