navigator.mediaDevices.getUserMedia({ video: true })
.then(stream => {
    document.getElementById("video").srcObject = stream;
});

function markAttendance() {
    alert("Attendance Marked (Backend connect pending)");
}