package WMS.example.WMS.repositoryconfig;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import WMS.example.WMS.repository.local.dao.CompanyDao;
import WMS.example.WMS.repository.local.dao.FinYearDao;
import WMS.example.WMS.repository.local.dao.PeriodMasterDao;
import WMS.example.WMS.repository.local.dao.SubCompanyDao;
import WMS.example.WMS.repository.local.dao.UserMasterDao;
import WMS.example.WMS.repository.local.dao.WareHouseDetailDao;
import WMS.example.WMS.repository.local.dao.Wh_MasterDao;
import WMS.example.WMS.repository.local.dao.Wms_Tran_DTLDao;
import WMS.example.WMS.repository.local.dao.Wms_trf_dtlDao;
import WMS.example.WMS.repository.local.dao.Wms_trf_hdrDao;
import WMS.example.WMS.repository.local.dao.wmsTranHdrsDao;
import WMS.example.WMS.repository.local.model.Bin_Master;
import WMS.example.WMS.repository.local.model.Company;
import WMS.example.WMS.repository.local.model.FinancialYear;
import WMS.example.WMS.repository.local.model.PeriodMaster;
import WMS.example.WMS.repository.local.model.PickslipBinDetail;
import WMS.example.WMS.repository.local.model.PickslipDetail;
import WMS.example.WMS.repository.local.model.PickslipHeader;
import WMS.example.WMS.repository.local.model.SubCompany;
import WMS.example.WMS.repository.local.model.UserMaster;
import WMS.example.WMS.repository.local.model.WH_Master;
import WMS.example.WMS.repository.local.model.Wms_Tran_DTL;
import WMS.example.WMS.repository.local.model.Wms_Tran_HDR;
import WMS.example.WMS.repository.local.model.Wms_trf_dtl;
import WMS.example.WMS.repository.local.model.Wms_trf_hdr;
import WMS.example.WMS.ui.model.WareHouseDetail;
import WMS.example.WMS.util.converter.BigDecimalConverter;
import WMS.example.WMS.util.converter.DateTypeConverter;

@Database(entities ={
        Company .class,
        SubCompany .class,
        UserMaster.class,
        Wms_Tran_HDR.class,
        Wms_Tran_DTL.class,
        Wms_trf_hdr.class,
        Wms_trf_dtl.class,
        PeriodMaster.class,
        FinancialYear.class,
        WH_Master.class,
        WareHouseDetail.class,
        Bin_Master.class,
        PickslipHeader.class,
        PickslipDetail.class,
        PickslipBinDetail.class
},version =2)
@TypeConverters({BigDecimalConverter.class, DateTypeConverter.class})
public abstract class MedicoStockistDatabase  extends RoomDatabase {
    public abstract UserMasterDao userMasterDao();
    public abstract CompanyDao companyDao();
    public abstract SubCompanyDao subCompanyDao();
    public abstract wmsTranHdrsDao wmsTranHdrsDao();
    public abstract  Wms_Tran_DTLDao wms_Tran_DTLDao();

    public abstract Wms_trf_hdrDao wms_trf_hdrDao();

    public abstract Wms_trf_dtlDao wmsTrfDtlDao();
    public abstract FinYearDao  finYearDao();

    public abstract PeriodMasterDao periodMasterDao(); //Wh_MasterDao

    public abstract Wh_MasterDao wh_masterDao();

    public abstract WareHouseDetailDao wareHouseDetailDao();


}
