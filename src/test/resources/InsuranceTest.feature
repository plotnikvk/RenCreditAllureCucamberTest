#language: ru
 Функционал: Вклады

   Сценарий: 1 - Расчет процентов по вкладам

     Когда выбран пункт меню "Вклады"
     И появился заголовок - "Рассчитайте доходность по вкладу"

     Когда выбрана валюта – "Доллары США"
     Когда выбрана сумма вклада – "50000"
     Когда выбран срок вклада - "9 месяцев"
     Когда выбрано ежемесячное пополнение на сумму - "1000"
     И отмечен чекбокс – "Ежемесячная капитализация"

     Тогда проверено что автоматически заполнилось поле Ставка - "0,75%"
     Тогда проверено что автоматически заполнилось поле Начислено - "301,42"
     Тогда проверено что автоматически заполнилось поле Пополнение за 9 месяцев - "8000"
     Тогда проверено что автоматически заполнилось поле К снятию через 9 месяцев – "58301,42"


   Сценарий: 2 - Расчет процентов по вкладам

     Когда выбран пункт меню "Вклады"
     И появился заголовок - "Рассчитайте доходность по вкладу"

     Когда выбрана валюта – "Рубли"
     Когда выбрана сумма вклада – "2000000"
     Когда выбран срок вклада - "6 месяцев"
     Когда выбрано ежемесячное пополнение на сумму - "30000"
     И отмечен чекбокс – "Ежемесячная капитализация","Частичное снятие"

     Тогда проверено что автоматически заполнилось поле Ставка - "6,25%"
     Тогда проверено что автоматически заполнилось поле Начислено - "65132,87"
     Тогда проверено что автоматически заполнилось поле Пополнение за 9 месяцев - "150000"
     Тогда проверено что автоматически заполнилось поле К снятию через 9 месяцев – "2215132,87"