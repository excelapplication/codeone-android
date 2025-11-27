package WMS.example.WMS.repository.local.dao;

import WMS.example.WMS.repository.local.model.SKUMaster;
import WMS.example.WMS.repository.local.model.SkuMasterBean;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface SkuMasterDao {

    @Insert
    Long insert(SKUMaster skuMaster) throws Exception;

    @Query("select s.pk as pk,s.main_prod_id as main_prod_id,s.local_value as localValue,s.ERP_PROD_CD as erp_prod_code, " +
            "s.prod_id as prod_id ,s.SKU_ID as skuId, s.PROD_CD as prodCd, s.MODEL_BATCH_NO as model, s.qty as qty, " +
            "s.value as value, pa.para_id uom_id, pa.para_descr as uom, s.rate as rate, p.prod_name as prod_name from " +
            "SKU_MASTER s INNER join PRODUCT as p inner join PARAMETER pa where p.PROD_ID = s.PROD_ID and " +
            "pa.para_id = s.uom and pa.para_type = 'UOM' and sku_id =:skuId ")
    List<SkuMasterBean> getSkuMaster(long skuId) throws Exception;

    @Query("select * from SKU_MASTER where sync ='N'")
    List<SKUMaster> getSkuMaster() throws Exception;

    @Query("select * from SKU_MASTER where sku_id =:skuId and prod_id =:prodId")
    SKUMaster getSkuMasterBySkuId(Long skuId, Long prodId) throws Exception;

    @Query("Delete from Sku_master where sku_id =:skuId and prod_id =:prodId ")
    void deleteSkuMaster(Long skuId, Long prodId) throws Exception;

    @Query("Delete from Sku_master ")
    void deleteSkuMaster();

    @Query("update SKU_MASTER set main_prod_id = :prodId, sync =:sync where pk =:pk ")
    void update(Long pk, String sync, Long prodId) throws Exception;

    @Update
    void updateSkuMaster(SKUMaster skuMaster) throws Exception;

}
