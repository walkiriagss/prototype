package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NascidosVivosTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        NascidosVivos nascidosVivos = new NascidosVivos(5486548,"Theo", "Walkíria", new Medico("Maria", "1569845"));

        NascidosVivos nascidosVivosClone = nascidosVivos.clone();
        nascidosVivosClone.setRegistro(598565);
        nascidosVivosClone.setNome("Ana");
        nascidosVivosClone.setNomeMae("Adriana");

        assertEquals("NascidosVivos{registro=5486548, nome='Theo', nomeMae='Walkíria', medico=Medico{nome='Maria', crm='1569845'}}", nascidosVivos.toString());
        assertEquals("NascidosVivos{registro=598565, nome='Ana', nomeMae='Adriana', medico=Medico{nome='Maria', crm='1569845'}}", nascidosVivosClone.toString());
    }

}