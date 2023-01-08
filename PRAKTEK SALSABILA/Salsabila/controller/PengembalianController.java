/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salsabila.controller;


import Salsabila.model.*;
import Salsabila.view.FormPengembalian;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USER
 */
public class PengembalianController {
    private FormPengembalian formPengembalian;
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    private PeminjamanDao peminjamanDao;
    private PengembalianDao pengembalianDao;
    private Pengembalian pengembalian;

    
    public PengembalianController(FormPengembalian formPengembalian){
        this.formPengembalian = formPengembalian;
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
        pengembalianDao = new PengembalianDaoImpl();
    }
    
    public void bersihForm(){
        formPengembalian.getTxtTglpinjam().setText("");
        formPengembalian.getTxtTglkembali().setText("");
        formPengembalian.getTxtTgldikembalikan().setText("");
        formPengembalian.getTxtTerlambat().setText("");
        formPengembalian.getTxtDenda().setText(""); 
    }
    
    public void setCboNobp(){
        formPengembalian.getCboNobp().removeAllItems();
        List <Anggota> list = anggotaDao.getAll();
        for (Anggota anggota: list) {
            formPengembalian.getCboNobp().
                    addItem(anggota.getNobp()+"-"+anggota.getNama());
        }
    }
    
    public void setCboBuku(){
        formPengembalian.getCboBuku().removeAllItems();
        List <Buku> list = bukuDao.getAll();
        for (Buku buku: list) {
            formPengembalian.getCboBuku().
                    addItem(buku.getKodeBuku());
        }
    }
    
    public void save(){
        pengembalian = new Pengembalian();
        pengembalian.setNobp(formPengembalian.getCboNobp()
            .getSelectedItem().toString().split("-")[0]);
        pengembalian.setKodeBuku(formPengembalian.getCboBuku()
            .getSelectedItem().toString());
        pengembalian.setTglpinjam(formPengembalian.getTxtTglpinjam().getText());
        pengembalian.setTglkembali(formPengembalian.getTxtTglkembali().getText());
        pengembalian.setTgldikembalikan(formPengembalian.getTxtTgldikembalikan().getText());
        pengembalian.setTerlambat(formPengembalian.getTxtTerlambat().getText());
        pengembalian.setDenda(formPengembalian.getTxtDenda().getText());
        pengembalianDao.save(pengembalian);
        JOptionPane.showMessageDialog(formPengembalian, "Entri Ok");
        
    }
    
    public void getPengembalian(){
        int index = formPengembalian.getTblPengembalian().getSelectedRow();
        pengembalian = pengembalianDao.getPengembalian(index);
        if(pengembalian != null){
            List<Anggota> listAnggota = anggotaDao.getAll();
            for (Anggota anggota:listAnggota){
                if(pengembalian.getNobp()==anggota.getNobp()){
                    formPengembalian.getCboNobp().setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
                    break;
                }
            }
            formPengembalian.getCboBuku().setSelectedItem(pengembalian.getKodeBuku());
            formPengembalian.getTxtTglpinjam().setText(pengembalian.getTglpinjam());
            formPengembalian.getTxtTglkembali().setText(pengembalian.getTglkembali());
            formPengembalian.getTxtTgldikembalikan().setText(pengembalian.getTgldikembalikan());
            formPengembalian.getTxtTerlambat().setText(pengembalian.getTerlambat());
            formPengembalian.getTxtDenda().setText(pengembalian.getDenda());
        }
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formPengembalian.getTblPengembalian().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pengembalian> list = pengembalianDao.getAllPengembalian();
        for(Pengembalian pengembalian : list){
            Object[] data = {
                pengembalian.getNobp(),
                pengembalian.getKodeBuku(),
                pengembalian.getTglpinjam(),
                pengembalian.getTglkembali(),
                pengembalian.getTgldikembalikan(),
                pengembalian.getTerlambat(),
                pengembalian.getDenda(),

            };
            tabelModel.addRow(data);
        }
    }

    private static class PeminjamanDaoImpl implements PeminjamanDao {

        public PeminjamanDaoImpl() {
        }

        @Override
        public void save(Peminjaman peminjaman) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void update(int index, Peminjaman peminjaman) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void delete(int index) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Peminjaman getPeminjaman(int index) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<Peminjaman> getAllPeminjaman() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
