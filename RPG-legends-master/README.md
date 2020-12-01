# RPG-legends

<h3>Links com informações sobre o jogo</h3>

* [Especificação de Requisitos RPG Legends.](https://docs.google.com/document/d/1MevLhahBDVNIWTPbV9DRDYlHACcK0_L-f7GBt1GcZws/edit?usp=sharing) <br>
* [Regras do jogo RPG Legends.](https://docs.google.com/document/d/1jc2Bx-jubyX0fyTdepscKriBrCd-QCWpIKT17qW2Ohs/edit?usp=sharing) <br>

----------------------------------------------------------------------------------------------------------------------------------

Netgames é um framework que facilita o desenvolvimento de jogos distribuídos sem o conhecimento prévio em<br> 
  programação distribuida, os créditos sobre o framework são de Leonardo de Souza Brasil. Segue os links para<br>
  o [TCC Netgames Leonardo](https://www.inf.ufsc.br/~ricardo.silva/netgames/download/Documentos%20-%20inclusive%20o%20TCC%20de%20Leonardo%20de%20Souza%20Brasil/NetGamesNRT_TCC.pdf) e também uma
  [Apresentação do Netgames](https://www.inf.ufsc.br/~ricardo.silva/netgames/download/Documentos%20-%20inclusive%20o%20TCC%20de%20Leonardo%20de%20Souza%20Brasil/NetGamesNRT-Apresentacao2018.pdf)

----------------------------------------------------------------------------------------------------------------------------------

<h3>Configuraçao Netgames no Eclipse</h3><br>
  
  1. Fazer download dos arquivos
  [ngnrtFramework.jar](https://github.com/RafaelClaumann/RPG-legends/blob/master/netgames/ngnrtFramework.jar),
  [NetGamesFileOffline.jar](https://github.com/RafaelClaumann/RPG-legends/blob/master/NetGamesFileOffline.jar) e
  [servidor.jar](https://github.com/RafaelClaumann/RPG-legends/blob/master/servidor.jar). <br>
  2. Criar uma pasta chamada <b>netgames</b> no diretório do projeto e colocar <b>ngnrtFramework.jar dentro dela.</b><br>
  3. Colocar o arquivo <b>NetGamesFileOffline.jar na raiz do projeto.</b><br>
  4. <b>Executar o arquivo NetGamesFileOffline.jar</b>, isso vai <b>gerar</b> o arquivo <b>jogoMultiPlayer.properties</b><br>
  ``` java
  java -jar NetGamesFileOffline.jar
  ```
  5. <b>Copiar</b> o arquivo <b>gerado(jogoMultiPlayer.properties)</b> para a <b>pasta netgames</b> criada anteriormente.<br>
  6. Clicar com o <b>botao direito</b> do mouse sobre o projeto e ir até a opção <b>Properties.</b><br>
  7. Clicar em <b>Java Build Path</b> no menu a esquerda, selecionar <b>libraries</b>, clicar em <b>Add Class Folder...</b>
  8. Selecionar a pasta <b>netgames</b> criada anteriormente, em seguida clicar em <b>Add Jars...</b></br>
  9. Selecionar <b>ngnrtFramework.jar</b> clicar em <b> Apply and Close.</b>.
  10. Iniciar o <b>servidor.jar</b> em algum local da máquina, para facilitar coloquei na pasta do projeto.</br>
  ``` java
  java -jar servidor.jar
  ```
  
  11. O método <b>main</b> deste exemplo na classe <b>IntefaceJogo.java</b> no package <b>interfaceGrafica</b>.<br>
