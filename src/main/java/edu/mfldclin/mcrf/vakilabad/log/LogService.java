package edu.mfldclin.mcrf.vakilabad.log;

import java.awt.Color;
import java.awt.Font;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ehsun Behravesh <post@ehsunbehravesh.com>
 */
@Service
public class LogService {

    private static final Logger log = LoggerFactory.getLogger(LogService.class);

    private Map<Object, LogMonitor> logMonitors;

    @PostConstruct
    public void init() {
        log.info("LogService init.");
        logMonitors = new HashMap<>();
    }

    public void addMonitor(final LogMonitor monitor) {
        logMonitors.put(monitor, monitor);
    }

    public void log(final LogRecord logLine) {
        log.info("send log line to all monitors. " + logLine);
        logMonitors.forEach((key, monitor) -> {
            log.debug("Sending log line to the monitor: " + key + " line: " + logLine);
            monitor.logReceived(logLine);
        });
    }

    public void log(String text, Color color, boolean bold, boolean italic) {
        String html = String.format("<div style='color: %s; font-weight: %s; font-style: %s'>%s</div>",
                hex(color),
                (bold ? "bold" : ""),
                (italic ? "italic" : ""),
                text);
        log.debug(html);
        log(new LogRecord(html));
    }

    public void removeMonitor(final LogMonitor monitor) {
        logMonitors.remove(monitor);
    }

    public static String hex(Color color) {
        return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());        
    }
}
