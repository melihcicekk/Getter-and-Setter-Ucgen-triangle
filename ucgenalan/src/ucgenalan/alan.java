/**
 * Bu uygulama Getter ve Setter metodların kullanılması ile
 * üçgenin alan hesabını yapar.
 */


package ucgenalan;

/**
 *
 * @author melih
 */
class alan {
     private int taban;//Tabanı başka classta değiştirilemesin diye private yaptık.

private int h;//h'yi başka classta değiştirilemesin diye private yaptık.

public int gettaban()//getter metodu.
{
return taban;//taban değerini döndüren kod satırı.
}

public void settaban(int taban)//setter metodu
{
this.taban=taban;//Girilen uzunluğu tabana atayan kod satırı.
}
public int geth()//getter metodu.
{
return h;//h değerini döndüren kod satırı.
}
public void seth(int h)//setter metodu
{
this.h=h;//Girilen uzunluğu h'ye atayan kod satırı.
}
}
