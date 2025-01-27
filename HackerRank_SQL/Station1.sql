select * from station
/*Query the following two values from the STATION table:

The sum of all values in LAT_N rounded to a scale of  decimal places.
The sum of all values in LONG_W rounded to a scale of  decimal places.
ROUND(number, decimals, operation)*/
Select CONVERT(DECIMAL(18,4), Round(sum(Lat_N),2)) as Lat,CONVERT(DECIMAL(18,4), Round(sum(Long_W),2)) as Long from Station
/*Query the sum of Northern Latitudes (LAT_N) from STATION having values greater than  and less than . 
Truncate your answer to  decimal places.*/
Select sum(Lat_N) from station where Lat_N>32 and Lat_N<40
SELECT CONVERT(DECIMAL(18,4), ROUND(SUM(LAT_N), 4)) FROM STATION WHERE LAT_N BETWEEN 38.7880 AND 137.2345;
/*CONVERT(DECIMAL(18,4), ...)
Converts the rounded result into a DECIMAL data type with a precision of 18 and a scale of 4.
DECIMAL(18,4) means:
A total of up to 18 digits.
4 digits after the decimal point.
14 digits can be used before the decimal point.*/
select convert(Decimal(18,4),round(Max(Lat_N),4)) from Station where Lat_N<137.2345