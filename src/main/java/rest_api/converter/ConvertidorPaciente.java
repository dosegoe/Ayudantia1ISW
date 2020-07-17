package rest_api.converter;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

import rest_api.entity.Medico;
import rest_api.model.MMedico;

@Component("ConPaciente")
public class ConvertidorPaciente{

  public <List>MPAciente convertirLista(List<Paciente> pacientes){
    List<MPAciente> mpaciente = new ArrayList<>();
    for (Paciente paciente : pacientes){
      mpaciente.add(new MPaciente(paciente));
    }
    return mpaciente;
  }

  public MPaciente convertir(Paciente paciente){
    MPaciente mpaciente = new Mpaciente(paciente);
    return mpaciente;
  }

  public Paciente convertirmtoe(MPAciente paciente){
      Medico  epaciente = new Paciente(paciente.getId(),paciente.getIdmedico(),paciente.getEstado());
      return epaciente;
  }
}
