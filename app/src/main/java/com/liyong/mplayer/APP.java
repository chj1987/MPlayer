package com.liyong.mplayer;

import com.liyong.library.BaseApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ff on 2018/6/9.
 */

public class APP extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static class Person {
        private String name;
        private List<MainActivityContract.Plan> planList = new ArrayList<>();

        public Person(String name, List<MainActivityContract.Plan> planList) {
            this.name = name;
            this.planList = planList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<MainActivityContract.Plan> getPlanList() {
            return planList;
        }

        public void setPlanList(List<MainActivityContract.Plan> planList) {
            this.planList = planList;
        }
    }
}
