package edu.mfldclin.mcrf.vakilabad.spark;

//import org.apache.spark.SparkConf;
//import org.apache.spark.SparkContext;
//import org.apache.spark.sql.SparkSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ehsun Behravesh <post@ehsunbehravesh.com>
 */
@Service
public class SparkService {
    
    private static final Logger log = LoggerFactory.getLogger(SparkService.class);
    
    @Value("${spark.app.name}")
    private String appName;
    
    @Value("${spark.master}")
    private String master;
    
    @Value("${spark.driver.maxResultSize}")
    private String driverMaxResultSize;
    
    @Value("${spark.driver.memory}")
    private String driverMemory;
    
    @Value("${spark.executor.memory}")
    private String executorMemory;
    
    @Value("${spark.logConf}")
    private String logConf;
    
    //private SparkContext sparkContext;
    /*
    public SparkConf getSparkConf() {
        SparkConf sparkConf = new SparkConf()
                .setAppName(appName)
                .setMaster(master)
                .set("spark.driver.maxResultSize", driverMaxResultSize)
                .set("spark.driver.memory", driverMemory)
                .set("spark.executor.memory", executorMemory)
                .set("spark.logConf", logConf);
                
        return sparkConf;
    }
    
    public SparkContext getSparkContext() {
        if (sparkContext == null) {
            sparkContext = new SparkContext(getSparkConf());
        }
        
        return sparkContext;
    }
    /*
    public SparkSession getSparkSession() {
        SparkSession sparkSession = SparkSession.builder()
                .config(getSparkConf())
                .getOrCreate();
        
        return sparkSession;
    }
    */
    
}
