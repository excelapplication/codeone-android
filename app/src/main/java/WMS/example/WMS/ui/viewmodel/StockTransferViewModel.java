package WMS.example.WMS.ui.viewmodel;
import WMS.example.WMS.ContextApplication;
import WMS.example.WMS.repository.local.model.Wms_trf_dtl;
import WMS.example.WMS.repository.local.model.Wms_trf_hdr;
import WMS.example.WMS.repository.remote.api.TransactionalApi;
import WMS.example.WMS.repositoryconfig.MedicoStockistDatabase;
import WMS.example.WMS.util.ApplicationConstants;
import WMS.example.WMS.util.ApplicationSharedPreferences;
import WMS.example.WMS.util.RetrofitUtil;

import java.util.List;

public class StockTransferViewModel implements ApplicationConstants {

    private MedicoStockistDatabase medicoStockistDatabase;

    private String accCompanyCode, companyName, finYearId;
    private String empId;
    private TransactionalApi transactionalApi;
    private Long userId;

    public StockTransferViewModel() {
        this.medicoStockistDatabase = RetrofitUtil.getDatabase(ContextApplication.getContext());
        ApplicationSharedPreferences applicationSharedPreferences = new ApplicationSharedPreferences(ContextApplication.getContext());
        accCompanyCode = (String) applicationSharedPreferences.get(ACC_CO_CODE);
        accCompanyCode = (String) applicationSharedPreferences.get(ACC_CO_CODE);
        empId = (String) applicationSharedPreferences.get(EMP_ID);
        this.transactionalApi = TransactionalApi.instance;
        userId = (Long) applicationSharedPreferences.get(USER_ID);
        finYearId = (String) applicationSharedPreferences.get(SP_FIN_YEAR_ID);
        companyName =(String) applicationSharedPreferences.get(ACC_CO_CODE);
    }

    public List<Wms_trf_hdr> getTransferHdr() throws Exception {
        return medicoStockistDatabase.wms_trf_hdrDao().getTransferHdr();
    }

    public List<Wms_trf_dtl> getStockTransferDetail()throws Exception{
        return medicoStockistDatabase.wmsTrfDtlDao().getStockTransferDetail();
    }

    public Wms_trf_dtl getStockTrfDetail(Long wmsTrfDetailId) throws  Exception{
        return medicoStockistDatabase.wmsTrfDtlDao().getStockTrfDetail(wmsTrfDetailId);
    }


}
