/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Itf;

import javax.swing.JDialog;
import javax.swing.JFrame;
//import ui.manager.QuanLyBanAn;
import ui.manager.QuanLyMonAn;
import ui.manager.QuanLyTaiKhoan;
import ui.manager.BanAn;
import ui.manager.QuanLyChamCongNhanVien;
import ui.manager.xLichSuGiaoDich;
import ui.manager.QuanLyChiTieu;
import ui.manager.QuanLyNhanVien;
import ui.manager.ThongKeDoanhThu;
import util.XDialog;
import uui.Login;


public interface QuanLyNhaHangController {
      void init();
     default void exit(){
        if(XDialog.confirm("Bạn muốn kết thúc?")){
            System.exit(0);}}
        
    default void showJDialog(JDialog dialog){
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
        default void showLogin(JFrame frame){
        this.showJDialog(new Login(frame, true));
    }
    default void showQuanLyNhanVien(JFrame frame){
        this.showJDialog(new QuanLyNhanVien( frame, true));
    }
    default void showQuanLyMonAn(JFrame frame){
        this.showJDialog(new QuanLyMonAn(frame, true));
    }
    default void showQuanLyTaiKhoan(JFrame frame){
        this.showJDialog(new QuanLyTaiKhoan(frame, true));
    }
    default void showBanAn(JFrame frame){
        this.showJDialog(new BanAn(frame, true));
    }
    default void showThongKeDoanhThu(JFrame frame){
        this.showJDialog(new ThongKeDoanhThu(frame, true));
    }
    
    default void showQuanLyChiTieu(JFrame frame){
        this.showJDialog(new QuanLyChiTieu(frame, true));
    }
    default void showLichSuGiaoDich(JFrame frame){
        this.showJDialog(new xLichSuGiaoDich(frame, true));
    }
    default void showQuanLyChamCong(JFrame frame){
        this.showJDialog(new QuanLyChamCongNhanVien(frame, true));
    }
}
