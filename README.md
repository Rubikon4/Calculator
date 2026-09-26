# Calculator 1.0

[Русская версия](#калькулятор-10)

A simple console calculator written in Java. The program performs addition, subtraction, multiplication, and division of two numbers.

## Running and Using the Calculator

1. Run the `Main` class.
2. Enter the first number.
3. Enter an operator: `+`, `-`, `*`, or `/`.
4. Enter the second number.
5. Get the calculation result.

After displaying the result, the program starts a new calculation. To exit, enter `Q` at any stage.

Example:

```text
Enter the first number:
12.5
Enter an operation with operands (a symbol in the format + - * /):
*
Enter the second operand:
4
50
```

## Error Handling

The calculator validates user input and does not terminate when expected errors occur. Instead, it displays a clear message and repeats the current input stage.

The following situations are handled:

- a value that cannot be converted to a number is entered;
- a symbol other than one of the operators `+`, `-`, `*`, `/` is entered;
- an attempt is made to divide by zero;
- the special values `NaN`, `Infinity`, or `-Infinity` are entered;
- the calculation result exceeds the limits of the `double` type and becomes infinity.

`IllegalArgumentException` is used for input and calculation errors. The exception is caught in the `Main` class, after which the user can repeat the input.

## Result Rounding

Calculations are performed using the `double` type. This type may introduce precision errors when representing decimal fractions. For example, the result of `0.1 + 0.2` inside the program may look like this:

```text
0.30000000000000004
```

To avoid showing these technical precision errors to the user, the result is formatted using `DecimalFormat` with the following pattern:

```java
new DecimalFormat("0.##########")
```

The pattern displays no more than 10 digits after the decimal separator and does not add unnecessary zeros. `RoundingMode.HALF_UP`, the familiar school rounding rule, is used for rounding.

Output examples:

```text
0.1 + 0.2  -> 0.3
10 / 3     -> 3.3333333333
5 / 2      -> 2.5
5 + 5      -> 10
```

Only the string displayed to the user is rounded. The original calculation result remains a `double` value and is not changed.

## Limitations

The calculator is intended for ordinary calculations within the capabilities of the `double` type. It is not designed for precise calculations or for working with arbitrary-precision numbers.

---

# Калькулятор 1.0

Простой консольный калькулятор на Java. Программа выполняет сложение, вычитание, умножение и деление двух чисел.

## Запуск и использование

1. Запустите класс `Main`.
2. Введите первое число.
3. Введите оператор: `+`, `-`, `*` или `/`.
4. Введите второе число.
5. Получите результат вычисления.

После вывода результата программа начинает новый расчёт. Для завершения работы введите `Q` на любом этапе.

Пример:

```text
Введите первое число:
12.5
Введите операцию c операндами (символ в формате + - * /):
*
Введите второй операнд:
4
50
```

## Обработка ошибок

Калькулятор проверяет пользовательский ввод и не завершает работу при ожидаемых ошибках. Вместо этого он выводит понятное сообщение и повторяет текущий этап ввода.

Обрабатываются следующие ситуации:

- введено значение, которое нельзя преобразовать в число;
- вместо одного из операторов `+`, `-`, `*`, `/` введён другой символ;
- выполнена попытка деления на ноль;
- введены специальные значения `NaN`, `Infinity` или `-Infinity`;
- результат вычисления вышел за пределы типа `double` и превратился в бесконечность.

Для ошибок ввода и вычисления используется `IllegalArgumentException`. Исключение перехватывается в классе `Main`, после чего пользователь может повторить ввод.

## Округление результата

Вычисления выполняются с типом `double`. У этого типа возможна погрешность представления десятичных дробей. Например, результат выражения `0.1 + 0.2` внутри программы может иметь вид:

```text
0.30000000000000004
```

Чтобы не показывать пользователю такие технические погрешности, результат форматируется с помощью `DecimalFormat` по шаблону:

```java
new DecimalFormat("0.##########")
```

Шаблон выводит не более 10 знаков после десятичного разделителя и не добавляет лишние нули. Для округления используется `RoundingMode.HALF_UP` — привычное школьное правило округления.

Примеры вывода:

```text
0.1 + 0.2  -> 0,3
10 / 3     -> 3,3333333333
5 / 2      -> 2,5
5 + 5      -> 10
```

Округляется только строка, которая выводится пользователю. Исходный результат вычисления остаётся значением типа `double` и не изменяется.

## Ограничения

Калькулятор предназначен для обычных вычислений в пределах возможностей типа `double`. Он не рассчитан на точные расчёты и работу с числами произвольной точности.
