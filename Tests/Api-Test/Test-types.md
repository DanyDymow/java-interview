## Какие типы и виды тестирования применяются при тестировании API?

- Функциональное тестирование: бОльшая часть тестов API касается именно функциональности приложения, того что приложение должно делать (функциональные тест-кейсы).
- Ручное тестирование: хотя API-тесты сейчас в значительной мере автоматизируются, это не значит что вообще нет ручных тестов, например в Postman.
- Автоматизированное тестирование: тест-кейсы API автоматизируются, применяются соответствующие фреймворки. 
- Нагрузочное тестирование: эмулируется трафик на API и изучаются проблемные места; без этого бывает сложно предугадать, какие проблемы с API могут возникнуть при большой нагрузке. Применяются инструменты (чаще всего JMeter), отправляющие HTTP-запросы на эндпойнты API и измеряющие время ответа, количество ошибок и другие метрики. 
- Тестирование безопасности: проверка защищенности API от внешних угроз, верификация надежности шифрования, и в целом устойчивость архитектуры API; также контроль уровней доступа и деталей авторизации.
- В частности, тестирование на проникновение (пентест API): специалисты по безопасности, незнакомые с этим API, пытаются оценить устойчивость, симулируя поведение злоумышленника.