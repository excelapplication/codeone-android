package WMS.example.WMS.repository.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;

import WMS.example.WMS.repository.local.model.ClaimDetail;
import WMS.example.WMS.repository.local.model.ClaimHeader;


import java.util.List;

@Dao
public interface ClaimDao {

    @Insert
    void insert(List<ClaimHeader> claimHeaders) throws Exception;

    @Insert
    void insertDetail(List<ClaimDetail> claimDetails) throws Exception;


}
