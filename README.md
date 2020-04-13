Clasele Artist si Album fac referinta la tabelele artists si albums din baza de date
,fiecare element din clasa fiind o coloana din tabel.

Clasa PersistenceUtil contine o entitate care ajuta la crearea 'persistence unit'
numit MusicAlbumsPU, fiind cheia conexiunii catre baza de date.

Clasele ArtistRepository si AlbumRepository au fiecare un atribut EntityManagerFactory.
Metoda create are un element EntityManager, creat cu ajutorul atributului de tip EntityManagerFactory,
care face conexiunea.
Cum create va modifica tabelul-tabelele vom crea un obiect de tipul EntityTransaction, fiind folosit
pentru a insera albumul sau artistul in tabelul respectiv.

Metoda finById are un element EntityManager si cum id-ul este cheia primara cu ajutorul metodei find
vom cauta si eventual gasi albumul-artistul in cauza.

Metoda findByName are un element EntityManager. Metoda createNamedQuery returneaza un obiect de tip query,
iar acest obiect este preluat cu ajutorul lui getResultList() pentru a returna rezultatul cautat.

Metoda findByArtist a clasei AlbumRepository are un element EntityManager. Metoda createNamedQuery 
returneaza un obiect de tip query, iar acest obiect este preluat cu ajutorul lui getResultList() 
pentru a returna rezultatul cautat.
