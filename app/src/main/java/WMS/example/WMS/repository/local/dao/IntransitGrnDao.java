package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import WMS.example.WMS.repository.local.model.InTransitGRNDetail;
import WMS.example.WMS.repository.local.model.InTransitGRNHeader;


import java.util.List;

@Dao
public interface IntransitGrnDao {

    @Query("select * from INTRANSIT_HDR where ACCNTG_CO_CD =:acctngComCode and DSP_PARENT_COCD =:principalCode and IN_TRANSIT_IND=:intransitIndicator")
    List<InTransitGRNHeader> getIntransit(String acctngComCode, String principalCode, String intransitIndicator);


    @Insert
    void insertIntransitGrnHeader(List<InTransitGRNHeader> headers);

    @Insert
    void insertIntransitGrnDetail(List<InTransitGRNDetail> details);


}
