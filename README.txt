📦 PolynomialC Project Setup Instructions

This project computes the constant `c` of a polynomial using Lagrange Interpolation.
It reads data from `input.json` and parses it using Jackson.

✅ Files Included:
- PolynomialC.java
- input.json
- README.txt

❗ You MUST download these 3 JARs and place them in the same folder:
1. jackson-core-2.15.2.jar
   👉 https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.15.2/jackson-core-2.15.2.jar
2. jackson-databind-2.15.2.jar
   👉 https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.15.2/jackson-databind-2.15.2.jar
3. jackson-annotations-2.15.2.jar
   👉 https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.15.2/jackson-annotations-2.15.2.jar

🛠 How to Compile:
javac -cp ".;jackson-core-2.15.2.jar;jackson-databind-2.15.2.jar;jackson-annotations-2.15.2.jar" PolynomialC.java

▶️ How to Run:
java -cp ".;jackson-core-2.15.2.jar;jackson-databind-2.15.2.jar;jackson-annotations-2.15.2.jar" PolynomialC

(Replace `;` with `:` on Linux/macOS)

💬 Output will be:
Constant c = 1
