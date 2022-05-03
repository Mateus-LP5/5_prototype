import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class VeiculoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Veiculo veiculo = new Veiculo(1,"Volvo Original","VOLVO VM270 6X4R", new Carga("Móveis", 1));

        Veiculo veiculoClone = veiculo.clone();
        veiculoClone.setMarca("Volvo Clonado");
        veiculoClone.setCapacidadeCargaKg(2);
        veiculoClone.getCarga().setPesoTotal(2);

        assertEquals("Veiculo {capacidade total = 1.0, marca = 'Volvo Original', modelo = VOLVO VM270 6X4R, " +
                "carga ='Carga {tipo de carga = 'Móveis'peso total = 1.0}'}", veiculo.toString());
        assertEquals("Veiculo {capacidade total = 2.0, marca = 'Volvo Clonado', modelo = VOLVO VM270 6X4R, " +
                "carga ='Carga {tipo de carga = 'Móveis'peso total = 2.0}'}", veiculoClone.toString());

    }


}