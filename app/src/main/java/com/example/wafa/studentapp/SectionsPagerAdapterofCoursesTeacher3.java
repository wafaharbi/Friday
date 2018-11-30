package com.example.wafa.studentapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


class SectionsPagerAdapterofCoursesTeacher3 extends FragmentPagerAdapter{     //courses tab of teacher


    public SectionsPagerAdapterofCoursesTeacher3(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
//FilesIT473Fragment
        switch(position) {
            case 0:
                TeacherFragment1  teacherFragment1  = new TeacherFragment1();
                return teacherFragment1;

            case 1:
                TeacherFragmentIT473 teacherFragmentIT473 = new TeacherFragmentIT473();
                return  teacherFragmentIT473;
/*

1-TeacherFragment2
        2-TeacherFragmentIT215

        3-TeacherFragmentIT473
*/

            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position){

        switch (position) {
            case 0:
                return "Files";

            case 1:
                return "students";

           

            default:
                return null;
        }

    }

}
