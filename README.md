Proceso de trabajo:
1 Paquete "entidades" --> AutoCarrera : Encargado de dar "nacimiento" al auto, tiene la logica de "darvueltas" para el desgaste
y ademas de creacion necesaria para definir sus atributos "modificables" mediante setter y revisables por getters, 

2 Paquete "servicios" ---> PitStop: Clase encargada de mantecion vehicular y vinculacion directa con el paquete de auto mediante "
import racing.entidades.AutoCarrera;" solo modifica mediante setters respetando el encapsulamietno original del auto

3 Paquete "Main" --> Launcher: LLama a "todos los necesarios" para inciar una semi carrera,"import racing.entidades.AutoCarrera;
import racing.servicios.PitStop;" logica de vueltas entre 1 y 5 damos la vuelta(), con el auto definido y sus desgastes random
