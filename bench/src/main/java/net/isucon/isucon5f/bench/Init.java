package net.isucon.isucon5f.bench;

import java.util.List;

import net.isucon.bench.Scenario;
import net.isucon.bench.Step;
import net.isucon.bench.Result;
import net.isucon.bench.Parameter;
import net.isucon.bench.Session;

public class Init extends Scenario {
    private static long DURATION_MILLIS = 33 * 1000;

    public Init(Long timeout) {
        super(timeout);
    }

    @Override
    public Result finishHook(Result result) {
        if (result.violations.size() > 0)
            result.fail();
        return result;
    }

    @Override
    public void scenario(List<Session> originalSessions) {
        Session s = new Session(null);

        /*
        getAndCheck(s, "/initialize", "INITIALIZE DATA", (check) -> {
                check.isStatus(200);
                check.respondUntil(30L * 1000);
            });
        */
    }
}
