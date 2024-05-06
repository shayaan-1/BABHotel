package com.example.babhotel;

public class Feedback {
        private String feedback_Id;
        private String rating;
        private String comments;
        private Reservation reservation;

        public Feedback() {
        }

        public Feedback(String feedback_Id, String rating, String comments, Reservation reservation) {
                this.feedback_Id = feedback_Id;
                this.rating = rating;
                this.comments = comments;
                this.reservation = reservation;
        }

        public String getFeedback_Id() {
                return feedback_Id;
        }

        public void setFeedback_Id(String feedback_Id) {
                this.feedback_Id = feedback_Id;
        }

        public String getRating() {
                return rating;
        }

        public void setRating(String rating) {
                this.rating = rating;
        }

        public String getComments() {
                return comments;
        }

        public void setComments(String comments) {
                this.comments = comments;
        }

        public Reservation getReservation() {
                return reservation;
        }

        public void setReservation(Reservation reservation) {
                this.reservation = reservation;
        }
}
