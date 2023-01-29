
/*
@author kmodelewski.com
*/

  /*
  JAVA LIBRARIES:
  - java.time._
  import java.time.temporal.ChronoUnit.DAYS - for days comparison

  LocalDate - time without the timezone --LocalDate.now -> 2023-01-29
  LocalTime - time without the timezone --LocalTime.now -> 20:54:12.247229400
  LocalDateTime - date-time without timezone -- LocalDateTime.now-> 2023-01-29T20:54:12.247229400
  ZonedDateTime - date-time with timezone -- ZonedDateTime.now -> 2023-01-29T20:56:06.440230900+01:00[Europe/Warsaw]
  Instant - point in time --Instant.now -> 2023-01-29T19:56:06.393359500Z

  method now - new instance for current moment
  method of - to create dates of past/future

  LocalDate.of(1984,Month.MARCH, 13) -- creates a date in the past

  Links:
  https://www.baeldung.com/scala/duration-finiteduration

   */

  package Gists
  import java.time._

  object DateTime extends App{

    /*
    Calculate duration
    */
    val start = Instant.now
    Thread.sleep(2_000)
    val stop = Instant.now

    val duration = Duration.between(start, stop)
    println(s"duration: ${duration.toSeconds}")

    /*
    Local date from String. Accepts only this format. If we need convert from other string we have to use
    DateTimeFormatter.ofPattern("......") a następnie LocalDate.parse("string, obiekt DateTimeFormatter)
    */
    val date = LocalDate.parse("2023-02-25")
    println(date)

    //Comparison between dates

    import java.time.temporal.ChronoUnit.DAYS

    val date1 = LocalDate.of(2023, 1, 28)
    val date2 = LocalDate.of(2023, 1, 29)
    val dateDuration = DAYS.between(date1, date2)
    println(s"between dates $dateDuration")
  }

