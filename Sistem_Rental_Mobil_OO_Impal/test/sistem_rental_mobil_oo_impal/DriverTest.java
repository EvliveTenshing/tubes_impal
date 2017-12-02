/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_rental_mobil_oo_impal;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sistem_rental_mobil_oo_impal.model.Database;
import sistem_rental_mobil_oo_impal.model.LaporanRekening;
import sistem_rental_mobil_oo_impal.model.Mobil;
import sistem_rental_mobil_oo_impal.model.Pegawai;
import sistem_rental_mobil_oo_impal.model.Penyewa;
import sistem_rental_mobil_oo_impal.model.Supplier;
import sistem_rental_mobil_oo_impal.model.Transaksi;

/**
 *
 * @author Evlive
 */
public class DriverTest {

    public DriverTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of checkEmail method, of class Driver.
     */
    @Test
    public void testCheckEmail() {
        System.out.println("checkEmail");
        String email = "";
        Driver instance = new Driver();
        boolean expResult = false;
        boolean result = instance.checkEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of checkPassword method, of class Driver.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String password = "";
        Driver instance = new Driver();
        boolean expResult = false;
        boolean result = instance.checkPassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getListPegawai method, of class Driver.
     */
    @Test
    public void testGetListPegawai() {
        System.out.println("getListPegawai");
        Driver instance = new Driver();
        ArrayList<Pegawai> expResult = instance.getListPegawai();
        ArrayList<Pegawai> result = instance.getListPegawai();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setListPegawai method, of class Driver.
     */
    @Test
    public void testSetListPegawai() {
        System.out.println("setListPegawai");
        ArrayList<Pegawai> listPegawai = null;
        Driver instance = new Driver();
        instance.setListPegawai(listPegawai);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getListSupplier method, of class Driver.
     */
    @Test
    public void testGetListSupplier() {
        System.out.println("getListSupplier");
        Driver instance = new Driver();
        ArrayList<Supplier> expResult = instance.getListSupplier();
        ArrayList<Supplier> result = instance.getListSupplier();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setListSupplier method, of class Driver.
     */
    @Test
    public void testSetListSupplier() {
        System.out.println("setListSupplier");
        ArrayList<Supplier> listSupplier = null;
        Driver instance = new Driver();
        instance.setListSupplier(listSupplier);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getListPenyewa method, of class Driver.
     */
    @Test
    public void testGetListPenyewa() {
        System.out.println("getListPenyewa");
        Driver instance = new Driver();
        ArrayList<Penyewa> expResult = instance.getListPenyewa();
        ArrayList<Penyewa> result = instance.getListPenyewa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setListPenyewa method, of class Driver.
     */
    @Test
    public void testSetListPenyewa() {
        System.out.println("setListPenyewa");
        ArrayList<Penyewa> listPenyewa = null;
        Driver instance = new Driver();
        instance.setListPenyewa(listPenyewa);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getListMobil method, of class Driver.
     */
    @Test
    public void testGetListMobil() {
        System.out.println("getListMobil");
        Driver instance = new Driver();
        ArrayList<Mobil> expResult = instance.getListMobil();
        ArrayList<Mobil> result = instance.getListMobil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setListMobil method, of class Driver.
     */
    @Test
    public void testSetListMobil() {
        System.out.println("setListMobil");
        ArrayList<Mobil> listMobil = null;
        Driver instance = new Driver();
        instance.setListMobil(listMobil);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getListTransaksi method, of class Driver.
     */
    @Test
    public void testGetListTransaksi() {
        System.out.println("getListTransaksi");
        Driver instance = new Driver();
        ArrayList<Transaksi> expResult = instance.getListTransaksi();
        ArrayList<Transaksi> result = instance.getListTransaksi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setListTransaksi method, of class Driver.
     */
    @Test
    public void testSetListTransaksi() {
        System.out.println("setListTransaksi");
        ArrayList<Transaksi> listTransaksi = null;
        Driver instance = new Driver();
        instance.setListTransaksi(listTransaksi);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getListLaporan method, of class Driver.
     */
    @Test
    public void testGetListLaporan() {
        System.out.println("getListLaporan");
        Driver instance = new Driver();
        ArrayList<LaporanRekening> expResult = instance.getListLaporan();
        ArrayList<LaporanRekening> result = instance.getListLaporan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setListLaporan method, of class Driver.
     */
    @Test
    public void testSetListLaporan() {
        System.out.println("setListLaporan");
        ArrayList<LaporanRekening> listLaporan = null;
        Driver instance = new Driver();
        instance.setListLaporan(listLaporan);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getDb method, of class Driver.
     */
    @Test
    public void testGetDb() {
        System.out.println("getDb");
        Driver instance = new Driver();
        Database expResult = instance.getDb();
        Database result = instance.getDb();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setDb method, of class Driver.
     */
    @Test
    public void testSetDb() {
        System.out.println("setDb");
        Database db = null;
        Driver instance = new Driver();
        instance.setDb(db);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getUserNama method, of class Driver.
     */
    @Test
    public void testGetUserNama() {
        System.out.println("getUserNama");
        Driver instance = new Driver();
        String expResult = instance.getUserNama();
        String result = instance.getUserNama();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setUserNama method, of class Driver.
     */
    @Test
    public void testSetUserNama() {
        System.out.println("setUserNama");
        String userNama = "";
        Driver instance = new Driver();
        instance.setUserNama(userNama);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getUserAlamat method, of class Driver.
     */
    @Test
    public void testGetUserAlamat() {
        System.out.println("getUserAlamat");
        Driver instance = new Driver();
        String expResult = instance.getUserAlamat();
        String result = instance.getUserAlamat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setUserAlamat method, of class Driver.
     */
    @Test
    public void testSetUserAlamat() {
        System.out.println("setUserAlamat");
        String userAlamat = "";
        Driver instance = new Driver();
        instance.setUserAlamat(userAlamat);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getUserContact method, of class Driver.
     */
    @Test
    public void testGetUserContact() {
        System.out.println("getUserContact");
        Driver instance = new Driver();
        String expResult = instance.getUserContact();
        String result = instance.getUserContact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setUserContact method, of class Driver.
     */
    @Test
    public void testSetUserContact() {
        System.out.println("setUserContact");
        String userContact = "";
        Driver instance = new Driver();
        instance.setUserContact(userContact);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getUserLevel method, of class Driver.
     */
    @Test
    public void testGetUserLevel() {
        System.out.println("getUserLevel");
        Driver instance = new Driver();
        String expResult = instance.getUserLevel();
        String result = instance.getUserLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setUserLevel method, of class Driver.
     */
    @Test
    public void testSetUserLevel() {
        System.out.println("setUserLevel");
        String userLevel = "";
        Driver instance = new Driver();
        instance.setUserLevel(userLevel);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getUserEmail method, of class Driver.
     */
    @Test
    public void testGetUserEmail() {
        System.out.println("getUserEmail");
        Driver instance = new Driver();
        String expResult = instance.getUserEmail();
        String result = instance.getUserEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setUserEmail method, of class Driver.
     */
    @Test
    public void testSetUserEmail() {
        System.out.println("setUserEmail");
        String userEmail = "";
        Driver instance = new Driver();
        instance.setUserEmail(userEmail);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of reloadData method, of class Driver.
     */
    @Test
    public void testReloadData() {
        System.out.println("reloadData");
        Driver instance = new Driver();
        instance.reloadData();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getPegawaiByEmail method, of class Driver.
     */
    @Test
    public void testGetPegawaiByEmail() {
        System.out.println("getPegawaiByEmail");
        String email = "";
        Driver instance = new Driver();
        Pegawai expResult = instance.getPegawaiByEmail(email);
        Pegawai result = instance.getPegawaiByEmail(email);
        assertEquals(expResult.getEmail(), result.getEmail());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getSupplierByEmail method, of class Driver.
     */
    @Test
    public void testGetSupplierByEmail() {
        System.out.println("getSupplierByEmail");
        String email = "";
        Driver instance = new Driver();
        Supplier expResult = instance.getSupplierByEmail(email);
        Supplier result = instance.getSupplierByEmail(email);
        assertEquals(expResult.getId(), result.getId());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getPenyewaByEmail method, of class Driver.
     */
    @Test
    public void testGetPenyewaByEmail() {
        System.out.println("getPenyewaByEmail");
        String email = "";
        Driver instance = new Driver();
        Penyewa expResult = instance.getPenyewaByEmail(email);
        Penyewa result = instance.getPenyewaByEmail(email);
        assertEquals(expResult.getId(), result.getId());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getPegawaiById method, of class Driver.
     */
    @Test
    public void testGetPegawaiById() {
        System.out.println("getPegawaiById");
        int id = 0;
        Driver instance = new Driver();
        Pegawai expResult = instance.getPegawaiById(id);
        Pegawai result = instance.getPegawaiById(id);
        assertEquals(expResult.getId(), result.getId());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getSupplierById method, of class Driver.
     */
    @Test
    public void testGetSupplierById() {
        System.out.println("getSupplierById");
        int id = 0;
        Driver instance = new Driver();
        Supplier expResult = instance.getSupplierById(id);
        Supplier result = instance.getSupplierById(id);
        assertEquals(expResult.getId(), result.getId());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getPenyewaById method, of class Driver.
     */
    @Test
    public void testGetPenyewaById() {
        System.out.println("getPenyewaById");
        int id = 1;
        Driver instance = new Driver();
        Penyewa expResult = instance.getPenyewaById(id);
        Penyewa result = instance.getPenyewaById(id);
        assertEquals(expResult.getId(), result.getId());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getSupplierByNama method, of class Driver.
     */
    @Test
    public void testGetSupplierByNama() {
        System.out.println("getSupplierByNama");
        String namaSupplier = "";
        Driver instance = new Driver();
        Supplier expResult = instance.getSupplierByNama(namaSupplier);
        Supplier result = instance.getSupplierByNama(namaSupplier);
        assertEquals(expResult.getId(), result.getId());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getPenyewaByNama method, of class Driver.
     */
    @Test
    public void testGetPenyewaByNama() {
        System.out.println("getPenyewaByNama");
        String namaPenyewa = "";
        Driver instance = new Driver();
        Penyewa expResult = instance.getPenyewaByNama(namaPenyewa);
        Penyewa result = instance.getPenyewaByNama(namaPenyewa);
        assertEquals(expResult.getId(), result.getId());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getMobilBySupplierNamaMerk method, of class Driver.
     */
    @Test
    public void testGetMobilBySupplierNamaMerk() {
        System.out.println("getMobilBySupplierNamaMerk");
        String namaSupplier = "";
        String namaMobil = "";
        String namaMerk = "";
        Driver instance = new Driver();
        Mobil expResult = instance.getMobilBySupplierNamaMerk(namaSupplier, namaMobil, namaMerk);
        Mobil result = instance.getMobilBySupplierNamaMerk(namaSupplier, namaMobil, namaMerk);
        assertEquals(expResult.getId(), result.getId());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getMobilByNamaJumlahHarga method, of class Driver.
     */
    @Test
    public void testGetMobilByNamaJumlahHarga() {
        System.out.println("getMobilByNamaJumlahHarga");
        String namaMobil = "";
        int jumlah = 0;
        int harga = 0;
        Driver instance = new Driver();
        Mobil expResult = instance.getMobilByNamaJumlahHarga(namaMobil, jumlah, harga);
        Mobil result = instance.getMobilByNamaJumlahHarga(namaMobil, jumlah, harga);
        assertEquals(expResult.getId(), result.getId());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getMobilById method, of class Driver.
     */
    @Test
    public void testGetMobilById() {
        System.out.println("getMobilById");
        int id = 0;
        Driver instance = new Driver();
        Mobil expResult = instance.getMobilById(id);
        Mobil result = instance.getMobilById(id);
        assertEquals(expResult.getId(), result.getId());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getTransaksi method, of class Driver.
     */
    @Test
    public void testGetTransaksi() {
        System.out.println("getTransaksi");
        String namaPenyewa = "";
        String namaMobil = "";
        int jumlah = 0;
        int harga = 0;
        Driver instance = new Driver();
        Transaksi expResult = instance.getTransaksi(namaPenyewa, namaMobil, jumlah, harga);
        Transaksi result = instance.getTransaksi(namaPenyewa, namaMobil, jumlah, harga);
        assertEquals(expResult.getId(), result.getId());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getJumlahSaldoLaporanRekening method, of class Driver.
     */
    @Test
    public void testGetJumlahSaldoLaporanRekening() throws ParseException {
        System.out.println("getJumlahSaldoLaporanRekening");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date date = dateFormat.parse("30/11/2017");
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        Driver instance = new Driver();
        int expResult = instance.getJumlahSaldoLaporanRekening(sqlDate);
        int result = instance.getJumlahSaldoLaporanRekening(sqlDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
