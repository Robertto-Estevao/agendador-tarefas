package com.robertto.agendadortarefas.business.mapper;

import com.robertto.agendadortarefas.business.dto.TarefasDTO;
import com.robertto.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);

}
