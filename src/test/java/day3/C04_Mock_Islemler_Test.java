package day3;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class C04_Mock_Islemler_Test {

    /*
        Mockito.mock ile sanal bir obje olusturulur ve objeye ait methodlar calismis gibi diger islemler yapilir.
        verify ile objelerin calistirilip calistirilmadigi kontrol edilir.
        verify(dummyObject2,never()).silOgrenci(anyString()); hic cagirilmama durumunu kontrol eder.
        verify(dummyObject2,atLeast(2)).ekleOgrenci("Ahmet"); en az iki kere cagirilma durumunu kontrol eder.
     */

    @Test
    void islemler(){
        C04_Mock_Islemler dummyObject=Mockito.mock(C04_Mock_Islemler.class);
        dummyObject.guncelleOgrenci("Ahmet");
        dummyObject.silOgrenci("Mehmet");
        dummyObject.ekleOgrenci("Kasim");

        verify(dummyObject).ekleOgrenci("Kasim");
        verify(dummyObject).silOgrenci("Mehmet");
        verify(dummyObject).guncelleOgrenci("Ahmet");
    }

    @Test
    void testKacDefaCagirildi(){
        C04_Mock_Islemler dummyObject2= Mockito.mock(C04_Mock_Islemler.class);
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Mehmet");
        verify(dummyObject2,times(2)).ekleOgrenci("Ahmet");
        verify(dummyObject2,times(0)).ekleOgrenci("Halide");
        verify(dummyObject2,never()).silOgrenci(anyString());
        verify(dummyObject2,atLeast(2)).ekleOgrenci("Ahmet");
    }

    @Test
    void testSirasiniKontrol(){
        C04_Mock_Islemler dummyObject3= Mockito.mock(C04_Mock_Islemler.class);
        dummyObject3.ekleOgrenci("Ahmet");
        dummyObject3.ekleOgrenci("Huseyin");
        dummyObject3.silOgrenci("Ahmet");

        InOrder inOrder=inOrder(dummyObject3);
        inOrder.verify(dummyObject3).ekleOgrenci("Ahmet");
        inOrder.verify(dummyObject3).ekleOgrenci("Huseyin");
        inOrder.verify(dummyObject3).silOgrenci("Ahmet");
    }

}
