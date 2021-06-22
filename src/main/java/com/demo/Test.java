package com.demo;

import org.apache.hadoop.yarn.client.api.YarnClient;
import org.apache.hadoop.yarn.client.api.YarnClientApplication;
import org.apache.hadoop.yarn.conf.YarnConfiguration;
import org.apache.hadoop.yarn.exceptions.YarnException;

import java.io.IOException;

/**
 * @描述:
 * @公司:
 * @作者: jiangmb
 * @版本: 1.0.0
 * @日期: 2020/3/30 22:04
 */
public class Test {
    public static void main(String[] args){
        YarnConfiguration conf = new YarnConfiguration();
        conf.set("yarn.resourcemanager.address","hd-n1");

        YarnClient yarnClient = YarnClient.createYarnClient();
        yarnClient.init( conf );
        yarnClient.start();

        try {
            YarnClientApplication app = yarnClient.createApplication();
            app.getApplicationSubmissionContext().setApplicationName("test");
//            app.getApplicationSubmissionContext().setApplicationName( "demo.ApplicationMaster");
//            app.getApplicationSubmissionContext().setResource(Resource.newInstance(100, 1));
//            app.getApplicationSubmissionContext().setPriority(Priority.newInstance(0));
//            app.getApplicationSubmissionContext().setQueue("default");
//            ApplicationId appId = yarnClient.submitApplication(app
//                    .getApplicationSubmissionContext());

            System.out.println(app.getNewApplicationResponse().getApplicationId());
        } catch (YarnException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
