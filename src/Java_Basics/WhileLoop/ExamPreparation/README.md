# Java Basics

## Exam Preparation

### Description

    Напишете програма, в която Марин решава задачи от изпити, докато не получи съобщение "Enough" от лектора си.
    При всяка решена задача, той получава оценка. Програмата трябва да приключи прочитането на данни при команда "Enough" 
    или ако Марин получи определеният брой незадоволителни оценки. Незадоволителна е всяка оценка, която е по-малка или равна на 4.

#### Вход

- На първи ред - брой незадоволителни оценки - цяло число в интервала [1…5]
- След това многократно се четат по два реда:
- o Име на задача - текст
- o Оценка - цяло число в интервала [2…6]

#### Изход

- Ако Марин стигне до командата "Enough", отпечатайте на 3 реда:
- "Average score: {средна оценка}"
- "Number of problems: {броя на всички задачи}"
- "Last problem: {името на последната задача}"
- Ако получи определения брой незадоволителни оценки:
- "You need a break, {брой незадоволителни оценки} poor grades."
- Средната оценка да бъде форматирана до втория знак след десетичната запетая.