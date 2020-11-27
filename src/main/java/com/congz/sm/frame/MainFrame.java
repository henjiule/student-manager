package com.congz.sm.frame;

import com.congz.sm.entity.Department;
import com.congz.sm.factory.ServiceFactory;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.List;

/**
 * @ClassName MainFrame
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/17
 **/
public class MainFrame extends JFrame{
    private JPanel mainPanel;
    private JPanel topPanel;
    private JButton 院系管理Button;
    private JButton 班级管理Button;
    private JButton 学生管理Button;
    private JButton 奖惩管理Button;
    private JPanel centerPanel;
    private JPanel departmentPanel;
    private JPanel classPanel;
    private JPanel studentPanel;
    private JPanel rewardPanel;
    private JPanel rightPanel;
    private JPanel bottomPanel;
    private JPanel leftPanel;
    private JTextField depNameField;
    private JButton 选择图片Button;
    private JLabel logoLable;
    private JButton button1;
    private JButton 新增院系Button;
    private JButton 切换显示Button;
    private JPanel contentPanel;
    private JPanel toolBarPanel;
    private JPanel addDepPanel;
    private String uploadFileUrl;
    private File file;

    private final CardLayout c;

    public MainFrame() {
        init();
        c = new CardLayout();
        centerPanel.setLayout(c);
        centerPanel.add("1", departmentPanel);
        centerPanel.add("2", classPanel);
        centerPanel.add("3", studentPanel);
        centerPanel.add("4", rewardPanel);
        院系管理Button.addActionListener(e -> {
            c.show(centerPanel, "1");
            showDepartments();
        });
        班级管理Button.addActionListener(e -> {
            c.show(centerPanel, "2");
        });
        学生管理Button.addActionListener(e -> {
            c.show(centerPanel, "3");
        });
        奖惩管理Button.addActionListener(e -> {
            c.show(centerPanel, "4");
        });
        //左侧边栏切换效果
        新增院系Button.addActionListener(e ->{
            //获取左侧面板的可见性
            boolean visible = addDepPanel.isVisible();
            //不可见
            if (!visible) {
                //向右侧展开、背景颜色变化、可见
                leftPanel.setPreferredSize(new Dimension(180,this.getHeight()-100));
                //addDePanl.setBackground(new Color(55,90,106));
                addDepPanel.setVisible(true);
            }else {
                //向左侧收起、背景颜色还原、不可见
                leftPanel.setPreferredSize(new Dimension(60,this.getHeight()-100));
                //addDePanl.setBackground(new Color(114,140,153));
                addDepPanel.setVisible(false);

            }
            leftPanel.revalidate();


        });
//        新增院系Button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//
//            }
//        });
    }

    /**
     * 显示所有院系信息
     */
    private void showDepartments() {
        //移除原有数据
        departmentPanel.removeAll();
        //从service层获取到所有院系列表
        List<Department> departmentList = ServiceFactory.getDepartmentServiceInstance().selectAll();
        //获取总数
        int len = departmentList.size();
        //根据院系总数算出行数 (每行放4个)
        int row = len % 4 == 0 ? len / 4 : len / 4 + 1;
        //创建一个网络布局,每行4列，指定水平和垂直间距
        GridLayout girldLayout = new GridLayout(row,4,15,15);
        departmentPanel.setLayout(girldLayout);

        for (Department department : departmentList) {
            //给每个对象创建一个面板
            JPanel depPanel = new JPanel();
            //设置合适大小
            depPanel.setPreferredSize(new Dimension(200,200));
            //将院系名设置给面板标题
            depPanel.setBorder(BorderFactory.createTitledBorder(department.getDepartmentName()));
            //新建一个JLable标签,用来放置院系logo,并指定大小
            JLabel logoLabel = new JLabel("<html><img src='" + department.getLogo() + "' width=200 height=200/></html>");
            //图标标签加入院系面板
            depPanel.add(logoLabel);
            //院系面板加入主题内容面板
            departmentPanel.add(depPanel);
            //刷新主体内容面板
            departmentPanel.revalidate();
        }
    }

    public void init() {
//        this.setTitle("MainFrame");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }




    public static void main(String[] args) {

            new MainFrame();
    }

//    private void createUIComponents() {
//        // TODO: place custom component creation code here
//    }
}



