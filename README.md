# Societe Generale / Alten - WORDLE Kata

![wordle](img/wordle-a.png =400x400)

- [Wordle Rules:](#wordle-rules-)
- [What is expected from you ?](#what-is-expected-from-you--)
- [What is not expected !](#what-is-not-expected--)
- [Constraints.](#constraints)
- [The outcome function:](#the-outcome-function-)
- [Function rules (mapping wordle rukes to something textual)](#function-rules--mapping-wordle-rukes-to-something-textual-)
- [examples.](#examples)
    * [Hidden: ALTEN](#hidden--alten)
    * [Hidden: SIREN](#hidden--siren)
    * [Hidden: SIEGE](#hidden--siege)
- [Links / help](#links---help)

Welcome to this kata !

## Wordle Rules:

1. If any of your letters are highlighted as green, that means that you’ve got the right letter in the right place.
2. If any of the letters are highlighted as yellow, that means that those letters are in the word, but they’re currently
   in the wrong place.
3. Finally, if any of your letters are highlighted as grey, it means that those letters aren’t included anywhere in the
   secret word.

## What is expected from you ?

1. Provide a working function that check if a 5 letters word is matching a hidden word.
2. Provide information on how do you ensure your code is working.
3. Make sure you code is readable (meaning a new joiner should be able to understand in less than 1mn).
4. Working in a team, you'll have to explain how you were organized.

## What is not expected !

1. A UI to play at wordle.
2. An Algorithm that find the final solution for a given hidden word.
3. An algorithm that takes ages to check one proposal against a hidden word. (it should be <1s)

## Constraints.

* You can go over internet but if you copy/ paste it will be quickly detected.
* If needed, feel free to use any additional libraries that can help you.

## The outcome function:

* it's really basic and looks like:

```java
   String check(String word);
```

A [template class](src/main/java/sgcib/kata/wordle/WordleCommand.java) is provided to help you to boostrap a project

## Function rules (mapping wordle rukes to something textual)

1. Input of the function is a world, either in uppercase or lowercase.
2. Return is a string which is always a 5 letters string:
    1. If a letter is matching **at the right place**, return **this** letter in **uppercase**.
    2. If a letter is matching **not** at the right place, return **this** letter in **lowercase**.
    3. Any other cases return a "**.**"

## examples.

### Hidden: ALTEN

* providing **boost** --> result must be: **....t**
* providing **alarm** --> result must be: **AL...**
* providing **alert** --> result must be: **ALe..**
* providing **spiro** --> result must be: **.....**

### Hidden: SIREN

Special case:
If the attempt contains letters that is at right place and also wrong place: right place takes the priority:

* providing **AGREE** --> result must be: **..RE..**
* providing **SIEGE** --> result must be: **SIe..** (because there is no second 'E' in SIREN)

### Hidden: SIEGE

Special case:
If the attempt contains letters that is at right place and also wrong place: right place takes the priority:

* providing **JEWEL** --> result must be: **.e.e.**

## Links / help

* [Wordle](https://www.nytimes.com/games/wordle/index.html)
* Read the [HELP file](HELP.md) to set up your env.
* You can organize your teams as you want. here some example:
    * Task identification and attribution (Kanban/scrum/...)
    * Pair Programming
    * Mob Programming
    * Concurrent development (many person doing same thing), then joining to find the best solution
    * ...