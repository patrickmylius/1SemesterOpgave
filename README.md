# Min løsning til SemesterOpgavnen.

**Opgave 1 - Main.java**
Skriv en "Hello world!"-applikation i Java, klassenavnet skal være Main.

Lav en hello(String navn) metode i klassen. Metoden skal returnere teksten "Hello András!", når man kalder den som: hello("András")

Hvis man kalder metoden med en tom tekststreng hello(""), så skal den returnere "Hello World!”
Git commit din kode.

**Opgave 2 - MainTest.java**
Gennemse test/MainTest.java og få den til at køre på din computer (JUnit4.) Denne test tester din Main-klasse og dens metode.


Nu skal du sørge for, at både testHelloAndras() og testHelloEmptyString() tests bestås.  

Hint: Du kan se længden på en String med den indbyggede length() metode. En empty String har længden 0. 

**Opgave 3 - QuickMaths.java**
Du skal oprette en lommeregner-klasse, som indlæser to tal fra brugeren via Scanner og udfører matematiske operationer på den. Klassenavn: QuickMaths.


Klassen skal have 4 metoder:


gennemsnit(int a, int b), returnerer integer
sum(int a, int b), returnerer integer
start() - returnerer intet, men starter en løkke, der indlæser 2 tal, og viser både deres gennemsnit og sum, og starter forfra med at indlæse tal.
main-metoden (psvm) skal bringe det hele i spil, som det kan ses på billedet her → 



Skriv unit tests til metodene gennemsnit(int a, int b) og sum(int a, int b). Start() skal ikke testes.


Tegn UML klassediagram til klassen, og gem den i UML mappen i dit projekt.

**Opgave 4 - Loops.java**
Se klassen Loops.

Skriv en metode, der hedder waitingFor0(). Metoden skal blive ved med at indlæse tal fra brugeren så længe, tallet ikke er 0. Brug en while-loop og Scanner til indlæsning af tal. 


Skriv en metode, der hedder printBrugereArr(). Metoden skal vise alle brugere fra brugere[] vha. et for loop.


Skriv en metode, der hedder printBrugereReverseArr(). Metoden skal vise alle brugere fra brugere[] i omvendt rækkefølge.

**Opgave 5 - Refactoring og typer**
Noob Noobeson er din ny kollega fra Noobien. Han har kun lært datatypen String. Du skal hjælpe ham med at vælge de rette datatyper i klassen Person.

Vis gerne et eksempel på typecasting i Person-klassens toString()- og main()-metoder.

**Opgave 6 - Objektorienteret programmering**
I denne øvelse skal du designe og udvikle 3 nye java-klasser til en quiz-applikation: Sporgsmaal, Svar og Quiz.
Til at begynde med, må du gerne lave en ny pakke, som hedder quiz. Nedenstående klasser skal oprettes i denne pakke. 


Svar.java skal indeholde en enkelt instansvariabel af typen String, som skal indeholde teksten af en svarmulighed. 


Sporgsmaal.java skal repræsentere spørgsmålene i quizzen.

Klassen skal indeholde private instansvariabler svarende til teksten af spørgsmålet, en pointværdi, 2-4 svarmuligheder og en variable, der angiver, hvilket svar er det rigtige. Overvej, hvad er gode navne for disse variabler. 

Du skal via constructor eller setters sørge for, at følgende overholdes:



Et spørgsmål må være maksimum 100 tegn langt. 
Spørgsmålene skal have nogle svarmuligheder tilknyttet af typen Svar.
Objekterne skal indeholde information om, hvilket svar er det rigtige. 
Instansvariablerne skal være private, og du skal lave getters og setters således:
Hvis brugeren indtaster en længere spørgsmål end 100 tegn, skal du smide en exception som f.eks.: 
throw new IllegalArgumentException("Spørgsmål må maks. være 100 tegn.");
Hvis pointværdi er større eller mindre end forventet skal du også smide en tilsvarende exception. 
Den tredje klasse, som du skal udvikle, er Quiz.java, som skal indeholde et enkelt spørgsmåls-objekt med tilhørende svar. I denne klasse kan du i en main-metode bringe de andre klasser i spil. 
Tegn et klassediagram for ovenstående og implementer koden. 
Commit ændringerne.


**Opgave 7 - Nedarvning, enum og interfaces**
Nu skal du lave en ny klasse, der nedarver (extends) fra Sporgsmaal således, at der kan knyttes et billede til spørgsmålene. Klassens navn skal være SporgsmaalMedBillede. Billedet gemmes i klassen som en String, der indeholder en relativ sti til billedet, f. eks. “Jul.png”.


Lav et enum med navnet Language, der indeholder 2 sprog: Danish og English. Hint…


Opret et interface med navnet Translatable. Denne interface skal give mulighed for at oversætte klasser. Den skal indeholde en enkelt metode:
String translate(language); 

Skriv en kommentar om, hvordan interfacet bruges. 


Til sidst skal du anvende interfacet (implements) i Sporgsmaal- og Svar-klasserne således, at disse implementerer translate-metoden. Selve metoden skal bare svare, at “Oversættelse er ikke muligt endnu” eller “Translation is not available yet” afhængigt af, hvilket sprog sendes som argument. 

Commit ændringerne.


**Opgave 8 - Database**
Lav en database og en tabel i MySQL, som kan indeholde quiz-spørgsmål og svar. Udfyld 2-3 rækker med dummy-data. Eksporter din database og gem det i database mappen i dit projekt.  


Skriv minimum 5 eksempler på forskellige SQL queries, som du har lært. Disse queries skal virke sammen med din database. (F.eks. SELECT .. WHERE .. LIMIT, CREATE TABLE, CREATE DATABASE, INSERT INTO, DELETE, UPDATE, JOIN) Gem dem i en textfil med navnet queries.sql i database mappen i dit projekt.  
Commit ændringerne.
Opgave 9 - GUI
Design et GUI vha. Gluon SceneBuilder, som kan vise et spørgsmål og nogle svarmuligheder ad gangen. Det behøver ikke at ligne billedet her, det er blot til inspiration.
Commit ændringerne.
Opgave 10 - Dokumentation
Afslutningsvist skal du dokumentere dit projekt på følgende 3 måder: 
kommentarer i din kode
Readme.md
evt. JavaDocs i docs mappen.
Commit og push ændringerne.



