package com.praylist.mobileJoy.main;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.praylist.mobileJoy.fragment.BibleFragment;
import com.praylist.mobileJoy.fragment.HymnFragment;
import com.praylist.mobileJoy.fragment.MessageFragment;
import com.praylist.mobileJoy.fragment.PrayerFragment;
import com.praylist.mobileJoy.R;
import com.praylist.mobileJoy.fragment.QTFragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private HymnFragment hymnFragment;
    private PrayerFragment prayerFragment;
    private BibleFragment bibleFragment;
    private MessageFragment messageFragment;
    private QTFragment qtFragment;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);


        hymnFragment = new HymnFragment();
        prayerFragment = new PrayerFragment();
        bibleFragment = new BibleFragment();
        messageFragment = new MessageFragment();
        qtFragment = new QTFragment();


        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragment(hymnFragment, "찬양");
        viewPagerAdapter.addFragment(prayerFragment, "대표 기도");
        viewPagerAdapter.addFragment(bibleFragment, "말씀");
        viewPagerAdapter.addFragment(messageFragment, "메시지");
        viewPagerAdapter.addFragment(qtFragment, "QT");
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_guitar);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_pray);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_bible);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_sermon);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_qt);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition())
                {
                    case 0:
                        tab.setIcon(R.drawable.ic_guitar_clicked);
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_pray);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_bible);
                        tabLayout.getTabAt(3).setIcon(R.drawable.ic_sermon);
                        tabLayout.getTabAt(4).setIcon(R.drawable.ic_qt);
                        break;
                    case 1:
                        tab.setIcon(R.drawable.ic_pray_clicked);
                        tabLayout.getTabAt(0).setIcon(R.drawable.ic_guitar);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_bible);
                        tabLayout.getTabAt(3).setIcon(R.drawable.ic_sermon);
                        tabLayout.getTabAt(4).setIcon(R.drawable.ic_qt);
                        break;
                    case 2:
                        tab.setIcon(R.drawable.ic_bible_clicked);
                        tabLayout.getTabAt(0).setIcon(R.drawable.ic_guitar);
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_pray);
                        tabLayout.getTabAt(3).setIcon(R.drawable.ic_sermon);
                        tabLayout.getTabAt(4).setIcon(R.drawable.ic_qt);
                        break;
                    case 3:
                        tab.setIcon(R.drawable.ic_sermon_clicked);
                        tabLayout.getTabAt(0).setIcon(R.drawable.ic_guitar);
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_pray);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_bible);
                        tabLayout.getTabAt(4).setIcon(R.drawable.ic_qt);
                        break;
                    case 4:
                        tab.setIcon(R.drawable.ic_qt_clicked);
                        tabLayout.getTabAt(0).setIcon(R.drawable.ic_guitar);
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_pray);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_bible);
                        tabLayout.getTabAt(3).setIcon(R.drawable.ic_sermon);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        if(Objects.requireNonNull(tabLayout.getTabAt(0)).isSelected()){
            tabLayout.getTabAt(0).setIcon(R.drawable.ic_guitar_clicked);
            tabLayout.getTabAt(1).setIcon(R.drawable.ic_pray);
            tabLayout.getTabAt(2).setIcon(R.drawable.ic_bible);
            tabLayout.getTabAt(3).setIcon(R.drawable.ic_sermon);
            tabLayout.getTabAt(4).setIcon(R.drawable.ic_qt);
        }else if(Objects.requireNonNull(tabLayout.getTabAt(1)).isSelected()){
            tabLayout.getTabAt(0).setIcon(R.drawable.ic_guitar);
            tabLayout.getTabAt(1).setIcon(R.drawable.ic_pray_clicked);
            tabLayout.getTabAt(2).setIcon(R.drawable.ic_bible);
            tabLayout.getTabAt(3).setIcon(R.drawable.ic_sermon);
            tabLayout.getTabAt(4).setIcon(R.drawable.ic_qt);
        }else if(tabLayout.getTabAt(2).isSelected()) {
            tabLayout.getTabAt(0).setIcon(R.drawable.ic_guitar);
            tabLayout.getTabAt(1).setIcon(R.drawable.ic_pray);
            tabLayout.getTabAt(2).setIcon(R.drawable.ic_bible_clicked);
            tabLayout.getTabAt(3).setIcon(R.drawable.ic_sermon);
            tabLayout.getTabAt(4).setIcon(R.drawable.ic_qt);
        }else if(tabLayout.getTabAt(3).isSelected()) {
            tabLayout.getTabAt(0).setIcon(R.drawable.ic_guitar);
            tabLayout.getTabAt(1).setIcon(R.drawable.ic_pray);
            tabLayout.getTabAt(2).setIcon(R.drawable.ic_bible);
            tabLayout.getTabAt(3).setIcon(R.drawable.ic_sermon_clicked);
            tabLayout.getTabAt(4).setIcon(R.drawable.ic_qt);
        }else if(tabLayout.getTabAt(4).isSelected()) {
            tabLayout.getTabAt(0).setIcon(R.drawable.ic_guitar);
            tabLayout.getTabAt(1).setIcon(R.drawable.ic_pray);
            tabLayout.getTabAt(2).setIcon(R.drawable.ic_bible);
            tabLayout.getTabAt(3).setIcon(R.drawable.ic_sermon);
            tabLayout.getTabAt(4).setIcon(R.drawable.ic_qt_clicked);
        }



        BadgeDrawable badgeDrawable1 = tabLayout.getTabAt(0).getOrCreateBadge();
        BadgeDrawable badgeDrawable2 = tabLayout.getTabAt(1).getOrCreateBadge();
        BadgeDrawable badgeDrawable3 = tabLayout.getTabAt(2).getOrCreateBadge();
        BadgeDrawable badgeDrawable4 = tabLayout.getTabAt(3).getOrCreateBadge();


        badgeDrawable1.setVisible(true);
        badgeDrawable1.setNumber(4);
        badgeDrawable2.setVisible(true);
        badgeDrawable2.setNumber(1);
        badgeDrawable3.setVisible(true);
        badgeDrawable3.setNumber(1);
        badgeDrawable4.setVisible(true);
        badgeDrawable4.setNumber(1);

    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments = new ArrayList<>();
        private List<String> fragmentTitle = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);

        }

        public void addFragment(Fragment fragment, String title) {
            fragments.add(fragment);
            fragmentTitle.add(title);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitle.get(position);
        }
    }
}
