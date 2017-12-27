package com.example.lu.myapplication;

import java.util.List;

public class News {
    /**
     * NewsList : [{"NewsId":"9437c278-296b-43a2-a0a6-e81f9618fd23","Title":"参观考察活动","Abstract":"","ImageUrl":"http://182.254.152.65:8000/Upload/News/20160523190004251.png","PublishDate":"2016-05-23","Author":"admin"},{"NewsId":"dfa499f0-0f7c-41b8-8b92-c9844861d321","Title":"春的锣鼓，为五月太阳盛会敲响","Abstract":"","ImageUrl":"http://182.254.152.65:8000/Upload/News/20160523185952089.png","PublishDate":"2016-05-23","Author":"admin"},{"NewsId":"6e40e0a9-ed93-436b-8794-55d0cf1e60d3","Title":"阳光恩典砺风雨 绿色征程创新篇\u201d　SNEC十周年新闻讲坛会在上海传媒大厦召开","Abstract":"","ImageUrl":"http://182.254.152.65:8000/Upload/News/20160523185938792.png","PublishDate":"2016-05-23","Author":"admin"},{"NewsId":"7cc140b8-7892-4883-ab55-44cb6e5565fd","Title":"江苏军团\u201d将亮相上海国际太阳能产业展","Abstract":"","ImageUrl":"http://182.254.152.65:8000/Upload/News/20160523185925673.png","PublishDate":"2016-05-23","Author":"admin"},{"NewsId":"10cc028d-8bb5-4201-b9cc-29a2945ce9b9","Title":"我国光伏发电装机容量已超德国 分布式光伏发展迅速","Abstract":"","ImageUrl":"http://182.254.152.65:8000/Upload/News/20160523185911589.png","PublishDate":"2016-05-23","Author":"admin"},{"NewsId":"699ed4cb-4392-427c-8b6b-835acfe7ab31","Title":"新机遇新挑战机遇 SNEC亮点提前看","Abstract":"","ImageUrl":"http://182.254.152.65:8000/Upload/News/20160523185859083.png","PublishDate":"2016-05-23","Author":"admin"},{"NewsId":"b24b8a3d-9bec-4fdf-84f7-c5dfd68ee81d","Title":"林洋新能源受邀参加SNEC十周年纪念新闻讲坛会共商光伏行业发展","Abstract":"","ImageUrl":"http://182.254.152.65:8000/Upload/News/20160523185841795.png","PublishDate":"2016-05-23","Author":"admin"},{"NewsId":"e8ba87da-b57f-4f02-bce2-e42afefb2321","Title":"最新数据：日本市场单晶占比继续下滑到29%","Abstract":"","ImageUrl":"http://182.254.152.65:8000/Upload/News/20160523185821450.png","PublishDate":"2016-05-23","Author":"admin"},{"NewsId":"59ab7fde-6017-47ec-b749-288a9a0c2770","Title":"林洋集团总裁陆永华考察浙江同景新能源集团布局农光互补分布式光伏电站战略","Abstract":"","ImageUrl":"http://182.254.152.65:8000/Upload/News/20160523185803865.png","PublishDate":"2016-05-23","Author":"admin"},{"NewsId":"82c6ea15-70a5-4b16-be95-a31b121b3eaa","Title":"林洋集团总裁亲临河南考察光伏电站项目","Abstract":"","ImageUrl":"http://182.254.152.65:8000/Upload/News/20160523185749463.png","PublishDate":"2016-05-23","Author":"admin"}]
     * Pages : 3
     * ResultCode : 0
     * ResultMessage :
     */

    private int Pages;
    private int ResultCode;
    private String ResultMessage;
    private List<NewsListBean> NewsList;

    public int getPages() {
        return Pages;
    }

    public void setPages(int Pages) {
        this.Pages = Pages;
    }

    public int getResultCode() {
        return ResultCode;
    }

    public void setResultCode(int ResultCode) {
        this.ResultCode = ResultCode;
    }

    public String getResultMessage() {
        return ResultMessage;
    }

    public void setResultMessage(String ResultMessage) {
        this.ResultMessage = ResultMessage;
    }

    public List<NewsListBean> getNewsList() {
        return NewsList;
    }

    public void setNewsList(List<NewsListBean> NewsList) {
        this.NewsList = NewsList;
    }

    public static class NewsListBean {
        /**
         * NewsId : 9437c278-296b-43a2-a0a6-e81f9618fd23
         * Title : 参观考察活动
         * Abstract :
         * ImageUrl : http://182.254.152.65:8000/Upload/News/20160523190004251.png
         * PublishDate : 2016-05-23
         * Author : admin
         */

        private String NewsId;
        private String Title;
        private String Abstract;
        private String ImageUrl;
        private String PublishDate;
        private String Author;

        public String getNewsId() {
            return NewsId;
        }

        public void setNewsId(String NewsId) {
            this.NewsId = NewsId;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getAbstract() {
            return Abstract;
        }

        public void setAbstract(String Abstract) {
            this.Abstract = Abstract;
        }

        public String getImageUrl() {
            return ImageUrl;
        }

        public void setImageUrl(String ImageUrl) {
            this.ImageUrl = ImageUrl;
        }

        public String getPublishDate() {
            return PublishDate;
        }

        public void setPublishDate(String PublishDate) {
            this.PublishDate = PublishDate;
        }

        public String getAuthor() {
            return Author;
        }

        public void setAuthor(String Author) {
            this.Author = Author;
        }
    }
}
