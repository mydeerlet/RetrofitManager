package com.mydeerlet.myapplication;

import java.util.List;

public class UpdateModel {


    /**
     * data : {"yesterday":{"date":"25日星期日","high":"高温 10℃","fx":"西南风","low":"低温 -3℃","fl":"<![CDATA[<3级]]>","type":"晴"},"city":"北京","aqi":"292","forecast":[{"date":"26日星期一","high":"高温 10℃","fengli":"<![CDATA[<3级]]>","low":"低温 0℃","fengxiang":"西南风","type":"浮尘"},{"date":"27日星期二","high":"高温 8℃","fengli":"<![CDATA[3-4级]]>","low":"低温 -2℃","fengxiang":"北风","type":"晴"},{"date":"28日星期三","high":"高温 9℃","fengli":"<![CDATA[<3级]]>","low":"低温 -3℃","fengxiang":"北风","type":"多云"},{"date":"29日星期四","high":"高温 6℃","fengli":"<![CDATA[<3级]]>","low":"低温 -4℃","fengxiang":"南风","type":"多云"},{"date":"30日星期五","high":"高温 10℃","fengli":"<![CDATA[<3级]]>","low":"低温 -3℃","fengxiang":"东北风","type":"晴"}],"ganmao":"昼夜温差大，风力较强，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。","wendu":"7"}
     * status : 1000
     * desc : OK
     */

    private DataBean data;
    private int status;
    private String desc;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static class DataBean {
        /**
         * yesterday : {"date":"25日星期日","high":"高温 10℃","fx":"西南风","low":"低温 -3℃","fl":"<![CDATA[<3级]]>","type":"晴"}
         * city : 北京
         * aqi : 292
         * forecast : [{"date":"26日星期一","high":"高温 10℃","fengli":"<![CDATA[<3级]]>","low":"低温 0℃","fengxiang":"西南风","type":"浮尘"},{"date":"27日星期二","high":"高温 8℃","fengli":"<![CDATA[3-4级]]>","low":"低温 -2℃","fengxiang":"北风","type":"晴"},{"date":"28日星期三","high":"高温 9℃","fengli":"<![CDATA[<3级]]>","low":"低温 -3℃","fengxiang":"北风","type":"多云"},{"date":"29日星期四","high":"高温 6℃","fengli":"<![CDATA[<3级]]>","low":"低温 -4℃","fengxiang":"南风","type":"多云"},{"date":"30日星期五","high":"高温 10℃","fengli":"<![CDATA[<3级]]>","low":"低温 -3℃","fengxiang":"东北风","type":"晴"}]
         * ganmao : 昼夜温差大，风力较强，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。
         * wendu : 7
         */

        private YesterdayBean yesterday;
        private String city;
        private String aqi;
        private String ganmao;
        private String wendu;
        private List<ForecastBean> forecast;

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public static class YesterdayBean {
            /**
             * date : 25日星期日
             * high : 高温 10℃
             * fx : 西南风
             * low : 低温 -3℃
             * fl : <![CDATA[<3级]]>
             * type : 晴
             */

            private String date;
            private String high;
            private String fx;
            private String low;
            private String fl;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ForecastBean {
            /**
             * date : 26日星期一
             * high : 高温 10℃
             * fengli : <![CDATA[<3级]]>
             * low : 低温 0℃
             * fengxiang : 西南风
             * type : 浮尘
             */

            private String date;
            private String high;
            private String fengli;
            private String low;
            private String fengxiang;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFengli() {
                return fengli;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
