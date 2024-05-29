# enum-pattern
### ? **Java'da If-Else Karmasikligini Enum Pattern ile Azaltmak** ?
Bazen kod karmasik hale gelebilir, ozellikle de if-else veya switch-case yapilariyla dolu oldugunda. Java'da Enum Pattern kullanarak bu sorunu nasil cozdugumu paylasmak istiyorum.

### Enum Pattern Nedir ve Ne Ise Yarar?
Bu kod parcacigi, farkli bildirim turlerine gore nasil islem yapilacagini belirleyen bir enum olan `NotificationType` kullaniyor. Bu sayede, karmasik if-else bloklarindan kaciniyoruz ve kodumuzu daha temiz hale getiriyoruz.

Ayrica, her bildirim turu icin ayri bir service bulunuyor. Ornegin, e-posta bildirimleri `EmailNotificationServiceImpl` tarafindan islenirken, SMS bildirimleri `SmsNotificationServiceImpl` tarafindan isleniyor.

### Avantajlar:
- **Daha Temiz Kod**: Karmasik if-else veya switch-case bloklarini ortadan kaldirir.
- **Kolay Genisletilebilirlik**: Yeni bir bildirim turu eklemek sadece bir enum degeri eklemek kadar basit.
- **Bakim Kolayligi**: Moduler yapi sayesinde hata ayiklama ve kod bakimi daha kolay.


#Java #DesignPatterns #CleanCode #EnumPattern

### ?rnek ?stek ve Yan?tlar:
1. **E-posta Bildirimi G?nderme**
    - **Request:**
    ```
    POST http://localhost:8080/api/v1/notifications/sendNotification
    Content-Type: application/json

    {
      "to": "mete@gmail.com",
      "body": "test",
      "notificationType": "email"
    }
    ```
    - **Response:**
    ```
    Email notification sent to mete@gmail.com
    ```

2. **SMS Bildirimi G?nderme**
    - **Request:**
    ```
    POST http://localhost:8080/api/v1/notifications/sendNotification
    Content-Type: application/json

    {
      "to": "Mete",
      "body": "test",
      "notificationType": "sms"
    }
    ```
    - **Response:**
    ```
    Sms notification sent to Mete
    ```
