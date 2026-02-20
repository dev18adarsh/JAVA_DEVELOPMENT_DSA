package Projects.Portfolio;

public class Details{
        private String name;
        private String email;
        private int age;
        private String address;
        private String[] skills;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String[] getSkills() {
            return skills;
        }

        public void setSkills(String[] skills) {
            this.skills = skills;
        }
}

