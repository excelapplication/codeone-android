package WMS.example.WMS.util.json;

import WMS.example.WMS.repository.local.model.APMaster;
import WMS.example.WMS.repository.local.model.BatchMaster;
import WMS.example.WMS.repository.local.model.CRSPost;
import WMS.example.WMS.repository.local.model.DateBatchWiseStock;
import WMS.example.WMS.repository.local.model.GlPost;
import WMS.example.WMS.repository.local.model.NSBatchMaster;
import WMS.example.WMS.repository.local.model.PurchaseCnDnDtl;
import WMS.example.WMS.repository.local.model.PurchaseCndnHdr;

import java.util.List;

public class PurchaseCnDnJson {

    private List<PurchaseCndnHdr> purch_cndn_hdr;
    private List<PurchaseCnDnDtl> purch_cndn_dtl;
    private List<BatchMaster> batchMaster;
    private List<DateBatchWiseStock> dateBatchWiseStocks;
    private List<NSBatchMaster> nsBatchMasterList;
    private List<GlPost> gl_post;
    private List<CRSPost> crs_post;
    private List<APMaster> ap_master;

    public List<PurchaseCndnHdr> getPurch_cndn_hdr() {
        return purch_cndn_hdr;
    }

    public void setPurch_cndn_hdr(List<PurchaseCndnHdr> purch_cndn_hdr) {
        this.purch_cndn_hdr = purch_cndn_hdr;
    }

    public List<PurchaseCnDnDtl> getPurch_cndn_dtl() {
        return purch_cndn_dtl;
    }

    public void setPurch_cndn_dtl(List<PurchaseCnDnDtl> purch_cndn_dtl) {
        this.purch_cndn_dtl = purch_cndn_dtl;
    }

    public List<BatchMaster> getBatchMaster() {
        return batchMaster;
    }

    public void setBatchMaster(List<BatchMaster> batchMaster) {
        this.batchMaster = batchMaster;
    }

    public List<DateBatchWiseStock> getDateBatchWiseStocks() {
        return dateBatchWiseStocks;
    }

    public void setDateBatchWiseStocks(List<DateBatchWiseStock> dateBatchWiseStocks) {
        this.dateBatchWiseStocks = dateBatchWiseStocks;
    }

    public List<NSBatchMaster> getNsBatchMasterList() {
        return nsBatchMasterList;
    }

    public void setNsBatchMasterList(List<NSBatchMaster> nsBatchMasterList) {
        this.nsBatchMasterList = nsBatchMasterList;
    }

    public List<GlPost> getGl_post() {
        return gl_post;
    }

    public void setGl_post(List<GlPost> gl_post) {
        this.gl_post = gl_post;
    }

    public List<CRSPost> getCrs_post() {
        return crs_post;
    }

    public void setCrs_post(List<CRSPost> crs_post) {
        this.crs_post = crs_post;
    }

    public List<APMaster> getAp_master() {
        return ap_master;
    }

    public void setAp_master(List<APMaster> ap_master) {
        this.ap_master = ap_master;
    }
}
