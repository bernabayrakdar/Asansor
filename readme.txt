
ASANSÖRLERDEKİ TALEP YOĞUNLUĞUNUN MULTITHREAD İLE KONTROLÜ


Projemizde AVM’deki asansörlere gelen isteklerdeki yoğunluğu, multithread kullanarak asansörlerin birlikte kullanımının sağlanması istenmiştir.
İlk olarak Giriş classı oluşturulur. Bu class içerisinde her 500ms’de bir müşteri sayıları ve gitmek istedikleri kat bilgileri Kişiler classı ile nesneleri oluşturulup kuyruk0 olarak tanımlanan kuyruk yapısına atılır.
Daha sonra Çıkış classı oluşturulur. Bu classta her 1000ms’de bir katlarda bekleyen müşterilerden çıkış yapmak isteyen müşteri sayısı belirlenir ve her kat için oluşturulan kuyruk yapısına atılır. 
Asansör classı oluşturulur. İlk olarak 1.Asansör giriş kuyruğundan gelen müşterileri  giriş kattan kişi sayısı maksimum 10 olacak şekilde içine almaktadır. 
Kişi sayısı 10 veya duruma göre 10’dan daha küçük olduğunda çalışmaya başlamaktadır. 
Müşterileri sırasıyla gitmek istedikleri kata bırakmaktadır. Çıkış classından gönderilen her kattaki müşteri sayısı asansör hareketine göre güncellenir ve bu bilgi asansör classına gönderilir. 
Çıkış classında yapılan bu toplam kişi sayısına göre rastgele 1 ile 5 arasında kişi seçili katlarda asansöre binmeyi bekleyen kişiler olarak kuyruğa atılır ve bu kuyruklar asansör classına gönderilir. 
Asansör bu katlara geldiğinde Çıkış classından gelen bu bilgiyle kapasitesi 10’u geçmeyecek şekilde çıkış yapmak isteyen müşteriler alınır. 


Daha sonra Main classı oluşturulur. Burada her classın nesnesi oluşturulur ve threadler startlanır. 5  tane asansör olduğundan Asansör classından bu sayıda nesne üretilir. 
Main classında her kat için boş kuyruk oluşturulur. Bu kuyruklar classlara gönderilir.

Kontrol classı oluşturulur. Bu class Main classında oluşturulan aktif durumu false olan 5  asansör nesnesini alır. Asansörlerden birisi sürekli çalışmaktadır. 
Asansör classında tutulan katlardaki toplam müşteri sayısı Kontrol classında kullanılır. Kontrol classı katlardaki toplam kişi sayısı 20 veya daha büyük olduğunda asansörlerin durumu false iken true yapılır. 
Daha sonra asansörler duruma göre daha önce çalışmaya başlamamışsa startlanır ve diğer çalışan asansörler ile birlikte aynı işlemi yapmaya devam etmesi sağlanır.



Proje Java programlama dili eclipse ortamında gerçekleştirilmiştir. Zip dosyası indilir ve projenin olduğu klasör çıkartılır. Proje kullanılan ide ile File-import
ile  proje dosyası bulunarak import edilir ve çalıştırılır.




                                                                                                                                                                                                     180201020 Gamze SAVCIOĞLU
                                                                                                                                                                                                      170201078 Berna BAYRAKDAR