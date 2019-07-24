import java.util.ArrayList;
import java.util.List;

public class SimpleTemplate {
    private List<String> selectList;

    public static TemplateBuilder builder() {
        return new TemplateBuilder();
    }

    public static class TemplateBuilder {
        private List<String> selectLit;
        private String tableName;

        public TemplateBuilder select() {
            this.selectLit = new ArrayList<>();
            return this;
        }

        public TemplateBuilder comma(String str) {
            if (this.selectLit == null) {
                this.selectLit = new ArrayList<>();
            }
            this.selectLit.add(str);
            return this;
        }

        public TemplateBuilder from(String tableName) {
            this.tableName = tableName;
            return this;
        }
    }
}
