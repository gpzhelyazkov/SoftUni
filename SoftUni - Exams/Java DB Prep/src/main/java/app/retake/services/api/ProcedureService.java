package app.retake.services.api;

import app.retake.domain.dto.ProcedureXMLExportDTO;
import app.retake.domain.dto.ProcedureXMLImportDTO;
import app.retake.domain.dto.ProcedureXMLWrapperExportDTO;

public interface ProcedureService {
    void create(ProcedureXMLImportDTO dto);

    ProcedureXMLWrapperExportDTO exportProcedures();
}
