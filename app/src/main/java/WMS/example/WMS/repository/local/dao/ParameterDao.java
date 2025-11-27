package WMS.example.WMS.repository.local.dao;



import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import WMS.example.WMS.repository.local.model.Parameter;

@Dao
public interface ParameterDao {

    @Insert
    void insert(List<Parameter> parameterList) throws Exception;

    @Query("SELECT PARA_ID, PARA_CODE, PARA_DESCR, MEDICO2, TEXT4 FROM PARAMETER WHERE PARA_TYPE = :paraType ORDER BY PARA_DESCR")
    List<Parameter> getParameterByParaType(String paraType) throws Exception;

    @Query("SELECT PARA_ID, PARA_CODE, PARA_DESCR, MEDICO2 FROM PARAMETER WHERE PARA_TYPE = :paraType AND MEDICO2 = :medico2")
    Parameter getParameterByParaCodeAndType(String paraType, String medico2) throws Exception;

    @Query("SELECT PARA_DESCR FROM PARAMETER WHERE PARA_TYPE = :paraType AND PARA_ID = :paraId")
    String getParaDescByParaTypeAndId(String paraType, Long paraId) throws Exception;

    @Query("SELECT PARA_DESCR FROM PARAMETER WHERE PARA_TYPE = :paraType AND para_id = :paraId")
    String getParameterByParaTypeAndMedico(String paraType, String paraId) throws Exception;

}

