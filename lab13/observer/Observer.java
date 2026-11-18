package homework11.observer;

import java.io.*;

public interface Observer extends Runnable {
    DataOutputStream outputStreamToBeUsedByObservable();
}
