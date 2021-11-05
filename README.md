<h3 align=center>Hi there,Welcome to my README👋</h3>
<p>1.Diagram Class.<a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/ScreenshotPBO/Diagram%20Class%20of%20Lelang.png">Here</a></p>
<p>2.Hasil SS</p>
<img src="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/ScreenshotPBO/Screenshot%20(1869).png"class="image">
<img src="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/ScreenshotPBO/Screenshot%20(1870).png"class="image">
<b>
  <br>
  <br>
  Catatan aplikasi yang dibuat:<br>
a. Jika hendak melelang barang maka lakukan pengisian data barang dan status di isi true(menandakan barang bisa ditawar).<br>
<img src="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/ScreenshotPBO/Screenshot%20(1872).png"class="image">
  <br>
<b>Jika ingin melihat lebih lanjut tentang screenshot diatas bisa klik class <a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Main.java">Main.java</a></b>
  <br>
  <pre>Pada screenshot diatas terdapat percabangan berupa if else,If else disini digunakan untuk menanyakan apakah user akan menambah barang lelang atau tidak namun apapun jawabannya lelang tetap akan dilaksanankan.Perbedaan pada pilihan jawaban user akan mempengaruhi jalannya class <a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Main.java">Main.java</a> .Jika pilihan yang diinputkan oleh user kurang dari(<) IDBarang pada class barang maka tidak akan menambahkan item baru pada lelang tersebut.</pre>
b. Jika ingin melakukan penawaran maka data lelang diisi, lelang ditutup ketika status pada classBarang diubah menjadi false dan pemenang lelang adalah yang menawar tertinggi<br>
<img src="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/ScreenshotPBO/Screenshot%20(1875).png"class="image">
  <br>
<b>Jika ingin melihat lebih lanjut tentang screenshot diatas bisa klik class <a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Main.java">Main.java</a></b>
  <img src="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/ScreenshotPBO/Screenshot%20(1876).png"class="image">
  <br>
  <b>Jika ingin melihat lebih lanjut tentang screenshot diatas bisa klik class <a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Petugas.java">Petugas.java</a></b>
<pre>
Gambar pertama berisikan method askAjukanBarang yang mengandung percabangan ifelse didalamnya.Method ini dibuka dengan menampilkan <b>"Submit an item for auction?(Yes /No):"</b> setelah itu method dilanjutkan dengan percabangan apabila user menginputkan nilai/value/jumlah yang sama dengan(=) "Yes" maka akan memerintahkan petugas melakukan tugasnya dengan cara mengaktifkan method doYourJob pada class <a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Petugas.java">Petugas.java</a> Sesuai dengan screenshot dibawah ini.
</pre>
<br>
c. Buatlah class diagram dari aplikasi ini<br>
<img src="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/ScreenshotPBO/Diagram%20Class%20of%20Lelang%20third.png"class="image">
<br>
d. Buatlah beberapa class menjadi interface dan implementasinya<br>
<pre>
class menglelang merupakan java class interface sedangkan java class lelang merupakan implementasinya.<a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/mengLelang.java"> mengLelang.java</a><a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Lelang.java"> Lelang.java</a>
</pre>
e. Buatlah enkapsulasi, tentunya variabel lokal harus di private<br>
    <p>&nbsp; Enkapsulasi terjadi pada class : </p>
    <p>&ensp; -<a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Barang.java"> Barang.java</a></p>
    <p>&ensp; -<a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Masyarakat.java"> Masyarakat.java</a></p>
    <p>&ensp; -<a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Petugas.java"> Petugas.java</a></p>
f. Buatlah polimorfisme dalam aplikasi ini<br>
    <p>&nbsp; Polimorfisme terjadi dalam <a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Barang.java"> Barang.java</a>,<a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Lelang.java"> Lelang.java</a>,<a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Masyarakat.java"> Masyarakat.java</a> dan <a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Petugas.java"> Petugas.java</a> bisa di lihat dengan ciri-ciri @Override</p>
g. Jelaskan dimana inheritance terjadi<br>
    <p>&ensp;Pada class <a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Lelang.java"> Lelang.java </a>dan<a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/mengLelang.java"> mengLelang.java</a> memiliki diagram class yang sama persis hal ini dikarenakan adanya proses inheritance yang terjadi sejatinya hanya ada satu class tetapi karena adanya implementasi pada class Lelang dengan class mengLelang maka <a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Lelang.java"> Lelang.java</a> berhak untuk mengambil/memakai/menggunakan/mengakses semua method yang berada pada class mengLelang.<br>
    <p>&ensp;Extends dilakukan oleh class <a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Masyarakat.java"> Masyarakat.java </a>dan<a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/Petugas.java"> Petugas.java</a> kepada <a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/User.java"> User.java</a>.Pada class tersebut mereka semua mengambil method yang sama dari <a href="https://github.com/ariannnnnnn/praktikum-Java/blob/master/UKL-PBO/src/Lelang/User.java"> User.java</a> tetapi hasil akhir pada masing-masing cukup banyak perbedaan,hal ini membuktikan bahwa meskipun class memiliki induk yang sama tetapi tidak menutup kemungkinan bahwa tiap ankan memiliki isi yang berbeda.</p>
